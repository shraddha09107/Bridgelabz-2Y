class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Teacher: " + name + " | Subject: " + subject);
    }
}

class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Student: " + name + " | Grade: " + grade);
    }
}

class Staff extends Person {
    String position;

    Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    void displayRole() {
        System.out.println("Staff: " + name + " | Position: " + position);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher("Anishka", 28, "Mathematics");
        Student s = new Student("Ravi", 16, 10);
        Staff st = new Staff("Meera", 40, "Librarian");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}
