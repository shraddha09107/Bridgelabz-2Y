class Employee {
    public int employeeID;        // public
    protected String department;  // protected
    private double salary;        // private

    Employee(int id, String dept, double salary) {
        this.employeeID = id;
        this.department = dept;
        this.salary = salary;
    }

    // Public setter for private salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

// Subclass
class Manager extends Employee {
    String level;

    Manager(int id, String dept, double salary, String level) {
        super(id, dept, salary);
        this.level = level;
    }

    void display() {
        System.out.println("ID: " + employeeID + ", Dept: " + department + ", Salary: ₹" + getSalary() + ", Level: " + level);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Manager m = new Manager(201, "AI/ML", 80000, "Senior Manager");
        m.setSalary(90000); // modify salary via setter
        m.display();
    }
}
