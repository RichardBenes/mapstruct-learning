package org.richardbenes.profiles;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Profile {

    private final String name;
    private final int age;

    public String getDescription() {
        return "%s is %s years old".formatted(name, age);
    }
}
