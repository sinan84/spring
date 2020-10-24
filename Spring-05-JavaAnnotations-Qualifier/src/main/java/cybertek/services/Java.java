package cybertek.services;

import cybertek.interfaces.Course;
import cybertek.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    private ExtraSessions extraSessions;

    public void getTeachingHours() {

            System.out.println("Weekly teaching hours :" + (extraSessions.getHours()) );

    }
}
