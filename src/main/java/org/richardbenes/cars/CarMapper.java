package org.richardbenes.cars;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {

    Car engineAndPaintingToCar(Engine e, Painting p);

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    static void main(String[] args) {

        var engine = new Engine(21, "petrol");
        var painting = new Painting("red", "glossy");

        var car = INSTANCE.engineAndPaintingToCar(engine, painting);

        System.out.println(car);
    }
}
