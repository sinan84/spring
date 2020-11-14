package com.spring.model;


import com.spring.enums.Gender;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Mentor {
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
}
