package com.spring;

import com.spring.configs.SpringAppConfig;
import com.spring.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(SpringAppConfig.class);
        Course course = container.getBean("selenium", Course.class);
        course.getTeachingHours();
    }
}
