package com.azeem.javarest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true) // even if any new entry is added to the sample.json then this will ignore and will not cause any error
@NoArgsConstructor
@Data
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private boolean active;
    private Address address;
    private String[] languages;
}
