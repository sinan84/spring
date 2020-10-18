package lambda.course;

public class CourseTest {
    public static void main(String[] args) {
        Course javaCourse = () -> System.out.println("This is CourseTest Class");
        javaCourse.study();

        Course seleniumCourse = () -> System.out.println("This is CourseTest Class");
        seleniumCourse.study();

        Course javaCourse2 = new Java();
        javaCourse2.study();

        Course seleniumCourse2 = new Selenium();
        seleniumCourse2.study();

        Course javaCourse3 = new Course() {
            @Override
            public void study() {
                System.out.println("Studying Java");
            }
        };
        javaCourse3.study();

        Course seleniumCourse3 = new Course() {
            @Override
            public void study() {
                System.out.println("Studying Selenium");
            }
        };
        seleniumCourse3.study();

        //Java javaCourse4 = () -> System.out.println("This is javaCourse4...");
        //Target type of lambda conversion must be an interface. Error

    }
}
