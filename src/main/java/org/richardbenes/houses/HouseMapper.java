package org.richardbenes.houses;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

//@Mapper(builder = @Builder(disableBuilder = true))
public interface HouseMapper {

    House fromDto(HouseDto house);

    HouseMapper INSTANCE = Mappers.getMapper(HouseMapper.class);

    static void main(String[] args) {
        System.out.println("Hello from org.richardbenes.houses.HouseMapper");

        System.out.println("#let's create DTO");
        var houseDto = new HouseDto(12, 13);

        System.out.println("#let's convert it");
        var house = INSTANCE.fromDto(houseDto);

        System.out.println("#let's print it");
        System.out.println(house);
    }
}
