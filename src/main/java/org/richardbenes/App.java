package org.richardbenes;

import org.mapstruct.factory.Mappers;
import org.richardbenes.profiles.Profile;
import org.richardbenes.profiles.ProfileMapper;
import org.richardbenes.profiles.users.Residence;

public class App
{
    public static void main( String[] args )
    {
        var john = new Profile(
                "John", 14,
                new Residence("white house", "Prague, CZ")
        );

        var tom = new Profile(
                "Tom", 21,
                new Residence("cheap motel", "London, UK")
        );

        System.out.println(john.getDescription());
        System.out.println(tom.getDescription());

        var mapper = Mappers.getMapper(ProfileMapper.class);

        System.out.println(mapper.profileToDto(john));
        System.out.println(mapper.profileToDto(tom));
    }
}
