class Student {
    static String universityName = "GLA University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    String grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll No: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }
}

public class Main5 {
    public static void main(String[] args) {
        Student s1 = new Student("Ishka", 301, "A");
        Student s2 = new Student("Anish", 302, "B+");

        s1.displayDetails();
        s2.displayDetails();

        Student.displayTotalStudents();
    }
}
