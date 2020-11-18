package com.spring.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Mentor {
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private boolean graduated;
    private boolean batch;
    private String company;
}
