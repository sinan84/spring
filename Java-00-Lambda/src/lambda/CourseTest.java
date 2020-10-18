package lambda;

public class CourseTest {
    public static void main(String[] args) {
        Course javaCourse = () -> System.out.println("This is CourseTest Class");
        javaCourse.study();

        Course seleniumCourse = () -> System.out.println("This is CourseTest Class");
        seleniumCourse.study();

        Course java = new Java();
        java.study();

        Course selenium = new Selenium();
        selenium.study();

    }
}
