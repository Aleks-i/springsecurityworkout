package ru.springsecurity.workout.springsecurityworkout.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Developer {
    private Long id;
    private String lastName;
    private String firstName;
}
