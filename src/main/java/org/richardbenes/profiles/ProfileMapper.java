package org.richardbenes.profiles;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.richardbenes.profiles.users.Residence;

@Mapper
public interface ProfileMapper {

    @Mapping(source = "residence", target = "placeOfLiving")
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
}
