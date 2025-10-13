import java.io.Serializable;

class Employee implements Serializable {
    String name = "Ravi";
    int id = 101;

    public void printName() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee id: " + id);
    }
}
