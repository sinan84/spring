package cybertek.services;

import cybertek.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    private OfficeHours officeHours;

    @Autowired
    public Selenium(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public void getTeachingHours() {

        System.out.println("Weekly teaching hours :" + (20+officeHours.getHours()));

    }
}
