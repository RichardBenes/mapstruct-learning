package org.richardbenes.chapter5.s51_conversions;

import lombok.Data;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.time.Instant;
import java.util.Date;

@Mapper
public interface StringAndDatesMapper {

    StringAndDatesMapper INSTANCE = Mappers.getMapper(StringAndDatesMapper.class);

    @Mapping(target = "date", dateFormat = "DD.mm.yyyy")
    Model stringToDate(Dto dto);
    Dto dateToString(Model model);

    @Data
    class Model {
        private final Date date;
    }

    @Data
    class Dto {
        private final String date;
    }

    static void main(String[] args) {

        var dto = new Dto("7.6.2032");

        System.out.println(INSTANCE.stringToDate(dto));

        var model = new Model(Date.from(Instant.parse("2007-12-03T10:15:30.00Z")));

        System.out.println(INSTANCE.dateToString(model));
    }
}