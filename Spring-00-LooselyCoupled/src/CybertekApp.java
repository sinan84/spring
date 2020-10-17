import implemantation.Mentor;
import service.FullTimeMentor;
import service.MentorAccount;
import service.PartTimeMentor;

public class CybertekApp {
    public static void main(String[] args) {

        FullTimeMentor fullTime = new FullTimeMentor();
        MentorAccount mentor = new MentorAccount(fullTime);
        mentor.manageAccount();

        PartTimeMentor partTime = new PartTimeMentor();
        mentor = new MentorAccount(partTime);
        mentor.manageAccount();

    }
}
