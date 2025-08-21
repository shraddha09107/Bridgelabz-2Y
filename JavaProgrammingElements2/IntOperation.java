package labnew.JavaProgrammingElements.JavaProgrammingElements1;

import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        int result1 = a + b * c;     // multiplication before addition
        int result2 = a * b + c;     // multiplication before addition
        int result3 = c + a / b;     // division before addition
        int result4 = a % b + c;     // modulus before addition

        System.out.println("The results of Int Operations are " +
                           result1 + ", " + result2 + ", " + result3 + ", " + result4);

        sc.close();
    }
}
