package com.spring.services;

import com.spring.interfaces.Course;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Java implements Course {
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : 10");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Executing postConstruct method");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Executing preDestroy method");
    }

}
