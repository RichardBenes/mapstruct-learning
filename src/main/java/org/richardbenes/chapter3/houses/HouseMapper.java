package org.richardbenes.chapter3.houses;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

//@Mapper(builder = @Builder(disableBuilder = true))
@Mapper
public interface HouseMapper {

    House fromDto(HouseDto house);
    Tent fromDto(TentDto dto);

    HouseMapper INSTANCE = Mappers.getMapper(HouseMapper.class);

    static void main(String[] args) {
        System.out.println("Hello from org.richardbenes.houses.HouseMapper");

        System.out.println("#let's create DTO");
        var houseDto = new HouseDto(12, 13);

        System.out.println("#let's convert it");
        var house = INSTANCE.fromDto(houseDto);

        System.out.println("#let's print it");
        System.out.println(house);

        System.out.println("");

        System.out.println("#let's create DTO");
        var tentDto = new TentDto("blue", 2);

        System.out.println("#let's convert it");
        var tent = INSTANCE.fromDto(tentDto);

        System.out.println("#let's print it");
        System.out.println(tent);
    }
}
