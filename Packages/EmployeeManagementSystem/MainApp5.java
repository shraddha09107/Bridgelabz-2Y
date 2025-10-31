package com.company.main;
import com.company.hr.Employee;
import com.company.payroll.Payroll;

public class MainApp5 {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Shraddha", "HR", 40000);
        Payroll p = new Payroll();
        p.calculateBonus(e);

        System.out.println("Employee: " + e.getName() + " | Dept: " + e.getDepartment());
    }
}
