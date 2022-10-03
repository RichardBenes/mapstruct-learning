package org.richardbenes.phones;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Map;

@Mapper
public interface PhoneMapper {

    @Mapping(target = "color", source = "finish")
    Phone toPhone(Map<String, String> phone);

    PhoneMapper INSTANCE = Mappers.getMapper(PhoneMapper.class);

    static void main(String[] args) {
        System.out.println("Hello from org.richardbenes.phones.PhoneMapper");

        var map = Map.of(
                "finish", "blue",
                "weight", "210"
        );

        var phone = INSTANCE.toPhone(map);

        System.out.println(phone);
    }
}
