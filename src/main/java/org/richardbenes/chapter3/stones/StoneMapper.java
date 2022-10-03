package org.richardbenes.chapter3.stones;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StoneMapper {

    Stone fromDto(StoneDto dto);

    StoneMapper INSTANCE = Mappers.getMapper(StoneMapper.class);

    static void main(String[] args) {
        System.out.println("Hello from org.richardbenes.stones.StoneMapper");

        var dto = new StoneDto(10, 3);

        System.out.println(INSTANCE.fromDto(dto));
    }
}
