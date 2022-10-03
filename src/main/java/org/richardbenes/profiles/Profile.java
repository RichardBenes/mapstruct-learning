package org.richardbenes.profiles;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Profile {

    private final String name;
    private final int age;

    private final Residence residence;

    // TODO: What about mapping these two into one target property (`interests`)
    //  with some custom logic?
//    private final String pet;
//    private final String sport;

    public String getDescription() {
        return "%s is %s years old".formatted(name, age);
    }
}
