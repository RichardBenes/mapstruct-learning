package org.richardbenes.chapter3.cars;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {

    @Mapping(target = "id", source = "engine.id")
    Car engineAndPaintingToCar(Engine engine, Painting painting);

    @Mapping(target = "id", source = "engineId")
    Car engineAndPaintingToCar(int engineId, String type, Painting painting);

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    static void main(String[] args) {

        var engine = new Engine(1,21, "petrol");
        var painting = new Painting(2,"red", "glossy");

        var car = INSTANCE.engineAndPaintingToCar(engine, painting);

        System.out.println(car);

        var car2 = INSTANCE.engineAndPaintingToCar(3, "wankel", painting);

        System.out.println(car2);
    }
}
