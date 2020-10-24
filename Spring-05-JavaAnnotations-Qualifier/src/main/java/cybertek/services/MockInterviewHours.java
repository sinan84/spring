package cybertek.services;

import cybertek.interfaces.ExtraSessions;

public class MockInterviewHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 0;
    }
}
