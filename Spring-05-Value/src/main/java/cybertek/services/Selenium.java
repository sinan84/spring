package cybertek.services;

import cybertek.interfaces.Course;
import cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Qualifier;
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
