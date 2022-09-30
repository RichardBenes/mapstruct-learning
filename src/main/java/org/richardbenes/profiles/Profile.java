package org.richardbenes.profiles;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.richardbenes.profiles.users.Residence;

@Getter
@AllArgsConstructor
public class Profile {

    private final String name;
    private final int age;

    private final Residence residence;

    public String getDescription() {
        return "%s is %s years old".formatted(name, age);
    }
}
