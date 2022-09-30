package org.richardbenes;

import org.mapstruct.factory.Mappers;
import org.richardbenes.profiles.Profile;
import org.richardbenes.profiles.ProfileMapper;

public class App
{
    public static void main( String[] args )
    {
        var john = new Profile("Barley", 17);

        System.out.println(john.getDescription());

        var mapper = Mappers.getMapper(ProfileMapper.class);

        var dto = mapper.profileToDto(john);

        System.out.println(dto);
    }
}
