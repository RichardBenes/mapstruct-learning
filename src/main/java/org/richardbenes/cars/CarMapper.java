package org.richardbenes.cars;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {

    @Mapping(target = "id", source = "engine.id")
    Car engineAndPaintingToCar(Engine engine, Painting painting);

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    static void main(String[] args) {

        var engine = new Engine(1,21, "petrol");
        var painting = new Painting(2,"red", "glossy");

        var car = INSTANCE.engineAndPaintingToCar(engine, painting);

        System.out.println(car);
    }
}