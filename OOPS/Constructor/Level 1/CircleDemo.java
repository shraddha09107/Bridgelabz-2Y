class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0); // chaining
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    void displayDetails() {
        System.out.println("Radius: " + radius);
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(7.5);

        c1.displayDetails();
        c2.displayDetails();
    }
}
