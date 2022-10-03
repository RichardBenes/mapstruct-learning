package org.richardbenes.chapter3.profiles;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProfileMapper {

    @Mapping(source = "residence", target = "placeOfLiving")
//    @Mapping(source = "pet",target = "interests")
//    @Mapping(source = "sport", target = "interests")
    ProfileDTO profileToDto(Profile profile);

    default String residenceToDescription(Residence residence) {

        String building;

        if (residence.getBuilding().toLowerCase().contains("house")) {
            building = "house";
        } else {
            building = "flat (likely)";
        }

        String country;

        if (residence.getAddress().toLowerCase().contains("cz")) {
            country = "Czech Republic";
        } else {
            country = "some other state";
        }

        return "lives in %s in %s".formatted(building, country);
    }

    static void main( String[] args )
    {
        System.out.println("Hello in the `org.richardbenes.profiles.main()`");

        var john = new Profile(
                "John", 14,
                new Residence("white house", "Prague, CZ")
//                "dog Barry", "skiing"
        );

        var tom = new Profile(
                "Tom", 21,
                new Residence("cheap motel", "London, UK")
//                "cat Tom", "cycling"
        );

        System.out.println(john.getDescription());
        System.out.println(tom.getDescription());

        var mapper = Mappers.getMapper(ProfileMapper.class);

        System.out.println(mapper.profileToDto(john));
        System.out.println(mapper.profileToDto(tom));
    }
}
