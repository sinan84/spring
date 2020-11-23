public class SpringApp {
    public static void main(String[] args) {

        FullTimeMentor fullTime = new FullTimeMentor();
        PartTimeMentor partTime = new PartTimeMentor();

        Mentor mentor = new Mentor(fullTime, partTime);
        mentor.manageAccount();

        System.out.println("Tightly Coupled works...");
    }
}
