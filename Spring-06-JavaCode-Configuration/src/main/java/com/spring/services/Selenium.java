package com.spring.services;

import com.spring.interfaces.Course;
import com.spring.interfaces.ExtraSessions;

public class Selenium implements Course {
    private ExtraSessions extraSessions;

    public Selenium(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    public void getTeachingHours() {

        System.out.println("Weekly teaching hours : " + (20 + extraSessions.getHours()));

    }

}
