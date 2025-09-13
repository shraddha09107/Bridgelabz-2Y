class Employee {
    static String companyName = "TechCorp";
    static int totalEmployees = 0;

    final int id;
    String name, designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ishka", 201, "ML Engineer");
        Employee e2 = new Employee("Anish", 202, "Data Scientist");

        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();

        Employee.displayTotalEmployees();
    }
}
