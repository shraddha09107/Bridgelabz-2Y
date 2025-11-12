package com.jdbc.jdbcStudentsDatabase;

import java.util.Scanner;

public class Menu implements IMenu {

    Scanner sc = new Scanner(System.in);
    IStudent student = new StudentImpl();

    @Override
    public void showMenu() {
        while (true) {
            System.out.println("\nWelcome to JDBC");
            System.out.println("Student Database Menu");
            System.out.println("1. Insert a student");
            System.out.println("2. Insert multiple students");
            System.out.println("3. Update a student");
            System.out.println("4. Update multiple students");
            System.out.println("5. Delete a student");
            System.out.println("6. Delete multiple students");
            System.out.println("7. Show students");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 :
                	student.insertStudent();
                	break;
                case 2 :
                	student.insertMultipleStudent();
                	break;
                	
                case 3 :
                	student.updateStudent();
                	break;
                	
                case 4 :
                	student.updateMultipleStudent();
                	break;
                	
                case 5 :
                	student.deleteStudent();
                	break;
                	
                case 6 :
                	student.deleteMultipleStudent();
                	break;
                case 7 :
                	student.showStudents();
                	break;
                	
                case 8 :
                { 
                	System.out.println("Thanks"); 
                	break;
                	}
                default :
                	System.out.println("Invalid choice!");
            }
        }
    }
}