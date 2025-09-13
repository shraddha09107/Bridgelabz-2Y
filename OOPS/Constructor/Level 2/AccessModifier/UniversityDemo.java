class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int roll, String name, double CGPA, String specialization) {
        super(roll, name, CGPA);
        this.specialization = specialization;
    }

    void display() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA() + ", Specialization: " + specialization);
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Ishka", 9.2, "AI/ML");
        pg.display();
    }
}
