class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Ishka", 20);
        Person p2 = new Person(p1); // copy

        p1.display();
        p2.display();
    }
}
