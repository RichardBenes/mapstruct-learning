package org.richardbenes.profiles;

import org.mapstruct.Mapper;

@Mapper
public interface ProfileMapper {

    ProfileDTO profileToDto(Profile profile);
}
