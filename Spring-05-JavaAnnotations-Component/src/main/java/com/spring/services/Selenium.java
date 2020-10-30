package com.spring.services;

import com.spring.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {
    public void getTeachingHours() {

        System.out.println("Weekly teaching hours : 10");

    }
}
