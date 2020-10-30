package com.spring.services;

import com.spring.interfaces.Course;
import com.spring.interfaces.ExtraSessions;

public class Java implements Course {
//    OfficeHours officeHours;
//
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    ExtraSessions extraSessions;

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours :" + (20 + extraSessions.getHours()));
    }
}
