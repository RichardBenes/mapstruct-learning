package org.richardbenes.chapter3.baking;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OvenUpdatingMapper {

    // TODO: What if I want to get new instance, with new values? (not the same instance modified)
    Oven getDifferentlyConfiguredOven(OvenConfig ovenConfig, @MappingTarget Oven oven);

    OvenUpdatingMapper INSTANCE = Mappers.getMapper(OvenUpdatingMapper.class);

    static void main(String[] args) {

        var oven = new Oven(
                200,
                192,
                false,
                2,
                "raw meat",
                "none"
        );

        System.out.println(oven);

        var ovenConfig = new OvenConfig(220, true);

        System.out.println("Updating oven configuration with " + ovenConfig);
        var newOven = INSTANCE.getDifferentlyConfiguredOven(ovenConfig, oven);

        System.out.println(newOven);
    }
}
