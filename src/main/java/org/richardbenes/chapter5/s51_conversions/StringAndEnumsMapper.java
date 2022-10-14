package org.richardbenes.chapter5.s51_conversions;

import lombok.Data;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StringAndEnumsMapper {

    StringAndEnumsMapper INSTANCE = Mappers.getMapper(StringAndEnumsMapper.class);

    Model stringToEnum(Dto dto);
    Dto enumToString(Model model);

    enum OrderStatus {
        IN_PROGRESS(1), NON_EXISTENT(2), FAILED(5), FINISHED(8);

        OrderStatus(int i) {}
    }

    @Data
    class Model {
        private final OrderStatus orderStatus;
    }

    @Data
    class Dto {
        private final String orderStatus;
    }

    static void main(String[] args) {

        var dto = new Dto("IN_PROGRESS");

        System.out.println(INSTANCE.stringToEnum(dto));

        var model = new Model(OrderStatus.NON_EXISTENT);

        System.out.println(INSTANCE.enumToString(model));


    }
}