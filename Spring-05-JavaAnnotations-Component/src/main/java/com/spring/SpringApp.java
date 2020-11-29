package com.spring;

import com.spring.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        Course course = container.getBean("API", Course.class); //IF ALL LETTERS OF CLASSNAME ARE CAPITAL, YOU DONT NEED TO LOWERCASE THE FIRST LETTER...
        course.getTeachingHours();
    }
}
