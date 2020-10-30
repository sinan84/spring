package com.spring.services;

import com.spring.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {
//    @Autowired
//    @Qualifier("officeHours")
//    private ExtraSessions extraSessions;

    public void getTeachingHours() {

        System.out.println("Weekly teaching hours : 20");

    }
}
