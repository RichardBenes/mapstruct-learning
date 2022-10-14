package org.richardbenes.chapter5.s51_conversions;

import lombok.Data;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TheNumberFormatMapper {

    TheNumberFormatMapper INSTANCE = Mappers.getMapper(TheNumberFormatMapper.class);

    @Mapping(target = "price", numberFormat = "S#")
    Model stringToInt(Dto dto);

    @Mapping(target = "price", numberFormat = "₪#.00║")
    Dto intToString(Model model);

    @Data
    class Model {
        private final double price;
    }

    @Data
    class Dto {
        private final String price;
    }

    static void main(String[] args) {

        var model = new Model(33.129d);

        System.out.println(INSTANCE.intToString(model));

        var dto = new Dto("S123");

        System.out.println(INSTANCE.stringToInt(dto));
    }
}
