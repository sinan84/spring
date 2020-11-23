package com.spring.services;

import com.spring.interfaces.Course;

public class Selenium implements Course {
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : 30");
    }
}
