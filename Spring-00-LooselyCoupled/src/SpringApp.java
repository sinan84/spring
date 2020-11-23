import implemantation.Mentor;
import service.FullTimeMentor;
import service.MentorAccount;
import service.PartTimeMentor;

public class SpringApp {
    public static void main(String[] args) {

        FullTimeMentor fullTime = new FullTimeMentor();
        MentorAccount mentor = new MentorAccount(fullTime);
        mentor.manageAccount();

        PartTimeMentor partTime = new PartTimeMentor();
        MentorAccount mentor2 = new MentorAccount(partTime);
        mentor2.manageAccount();

    }
}
