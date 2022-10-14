package org.richardbenes.chapter5.s51_conversions;

import lombok.Data;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Currency;
import java.util.UUID;

@Mapper
public interface StringAndCurrencyUuidUrl {

    StringAndCurrencyUuidUrl INSTANCE = Mappers.getMapper(StringAndCurrencyUuidUrl.class);

    Model stringToPropers(Dto dto);
    Dto propersToString(Model model);

    @Data
    class Model {
        private final Currency currency;
        private final URL url;
        private final UUID uuid;
    }

    @Data
    class Dto {
        private final String currency;
        private final String url;
        private final String uuid;
    }

    static void main(String[] args) throws MalformedURLException {

        var dto = new Dto(
                "EUR",
                "https://www.get.it:4550/where-are-we.jsp",
                "202d65d2-bdac-4984-812d-41b0018f78d8"
        );

        System.out.println(INSTANCE.stringToPropers(dto));

        var model = new Model(
                Currency.getInstance("CZK"),
                new URL("http://that.cool.site:8080/page.html"),
                UUID.fromString("202d65d2-bdac-4984-812d-41b0018f78d8")
        );

        System.out.println(INSTANCE.propersToString(model));
    }
}