import java.util.Scanner;
class Employees{
    String name;
    int age;
    int Emp_sal;
    int Id;
    public void getDetails(Scanner sc){
        System.out.println("Enter emp name : ");
        name=sc.next();
        System.out.println("Enter emp age : ");
        age=sc.nextInt();
        System.out.println("Enter emp salary : ");
        Emp_sal=sc.nextInt();
        System.out.println("Enter emp Id : ");
        Id= sc.nextInt();
    }
    
    public void Display(){
        System.out.println("Employee Id:"+Id);
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Age:"+age);
        System.out.println("Employee salary:"+Emp_sal);
        
    }
}
public class EmployeeDetails{
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of employees: ");
        int num=sc.nextInt();
        Employees[] employees = new Employees[num];

        // Input details
        for (int i = 0; i < num; i++) {
            employees[i] = new Employees();
            System.out.println("\nEnter details for Employee " + (i + 1));
            employees[i].getDetails(sc);
        }

        // Display details
        System.out.println("\n--- Employee Details ---");
        for (Employees emp : employees) {
            emp.Display();
        }

        sc.close();
    }
}

        
