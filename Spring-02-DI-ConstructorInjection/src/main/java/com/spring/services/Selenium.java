package com.spring.services;

import com.spring.interfaces.Course;

public class Selenium implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : 15");
    }
}
