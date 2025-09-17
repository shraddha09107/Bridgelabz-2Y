import java.util.*;

abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;

    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId; this.name = name; this.baseSalary = baseSalary;
    }

    // encapsulation
    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base: " + baseSalary);
    }

    public abstract double calculateSalary();
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double monthlyBonus;

    public FullTimeEmployee(String id, String name, double base, double bonus) {
        super(id, name, base);
        this.monthlyBonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + monthlyBonus;
    }

    @Override
    public void assignDepartment(String dept) { this.department = dept; }

    @Override
    public String getDepartmentDetails() { return "Department: " + department; }
}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(String id, String name, double hourlyRate, int hours) {
        super(id, name, 0.0);
        this.hourlyRate = hourlyRate; this.hoursWorked = hours;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void assignDepartment(String dept) { this.department = dept; }

    @Override
    public String getDepartmentDetails() { return "Department: " + department; }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        FullTimeEmployee f = new FullTimeEmployee("F001","Anya",50000,5000);
        f.assignDepartment("Engineering");
        PartTimeEmployee p = new PartTimeEmployee("P001","Ravi",500,60);
        p.assignDepartment("Support");

        employees.add(f); employees.add(p);

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Computed Salary: " + e.calculateSalary());
            if (e instanceof Department) {
                System.out.println(((Department) e).getDepartmentDetails());
            }
            System.out.println("-----");
        }
    }
}
