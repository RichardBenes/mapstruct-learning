package org.richardbenes.profiles;

import lombok.Data;

@Data
public class ProfileDTO {

    private final String name;
    private final int age;
    private final String placeOfLiving;
    private final String interests;
}
