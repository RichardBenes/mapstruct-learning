package org.richardbenes.chapter3.plants;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PlantMapper {

    @Mapping(target = "height", source = "stalkProperties.height")
    @Mapping(target = ".", source = "stalkProperties")
    @Mapping(target = ".", source = "leafProperties")
    FlatSunflowerDto sunflowerToDto(Sunflower sunflower);

    PlantMapper INSTANCE = Mappers.getMapper(PlantMapper.class);

    static void main(String[] args) {

        var sunflower = new Sunflower(
                new LeafProperties(200, "dark green"),
                new StalkProperties(1500, 14)
        );

        System.out.println(sunflower);

        var dto = INSTANCE.sunflowerToDto(sunflower);

        System.out.println(dto);
    }
}
