package cybertek.services;

import cybertek.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    private OfficeHours officeHours;

    //@Autowired -->if we have only one cons we dont need to put this annotations
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public void getTeachingHours() {

            System.out.println("Weekly teaching hours :" +(30+officeHours.getHours()) );

    }
}
