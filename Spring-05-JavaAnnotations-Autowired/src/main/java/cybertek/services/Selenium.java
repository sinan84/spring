package cybertek.services;

import cybertek.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    private OfficeHours officeHours;

    public void getTeachingHours() {

        System.out.println("Weekly teaching hours :" + (20+officeHours.getHours()));

    }
}
