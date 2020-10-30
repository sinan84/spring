package com.spring.configs;

import com.spring.interfaces.ExtraSessions;
import com.spring.services.Java;
import com.spring.services.OfficeHours;
import com.spring.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.spring")
@PropertySource("classpath:application.properties")
public class CybertekAppConfig {
    @Bean
    public Java java(){
        return new Java();
    }
    @Bean
    public Selenium selenium(){
        return new Selenium(extraSessions());
    }
//    @Bean
//    public OfficeHours officeHours(){
//        return new OfficeHours();
//    }
    @Bean
    public ExtraSessions extraSessions(){
        return new OfficeHours();
    }
}
