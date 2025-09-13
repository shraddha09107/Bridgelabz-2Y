class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "OpenAI Academy";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: ₹" + fee + ", Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

public class CourseDemo {
    public static void main(String[] args) {
        Course c1 = new Course("AI", 6, 25000);
        c1.displayCourseDetails();
        Course.updateInstituteName("Ishka Academy");
        c1.displayCourseDetails();
    }
}
