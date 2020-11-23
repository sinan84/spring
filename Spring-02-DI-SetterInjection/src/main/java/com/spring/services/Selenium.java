package com.spring.services;

import com.spring.interfaces.Course;
import lombok.Data;

@Data
public class Selenium implements Course {

    private OfficeHours officeHours;

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours :" + (15 + officeHours.getHours()));
    }
}
