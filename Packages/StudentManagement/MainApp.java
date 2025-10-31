import college.faculty.Faculty;
import college.student.Student;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student();
        Faculty f = new Faculty();

        s.displayStudent();
        f.displayFaculty();
    }
}
