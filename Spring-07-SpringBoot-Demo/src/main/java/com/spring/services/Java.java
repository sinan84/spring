package com.spring.services;

import com.spring.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Java implements Course {
    private OfficeHours officeHours;

    @Value("${instructor}")
    private String instructorName;

    @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : "+ officeHours.getHours() );
    }


    @PostConstruct
    public void postConstruct(){
        System.out.println("Executing postConstruct method");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Executing preDestroy method");
    }

}
