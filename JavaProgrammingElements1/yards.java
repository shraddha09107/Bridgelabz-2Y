package labnew.JavaProgrammingElements.JavaProgrammingElements1;
import java.util.Scanner;

public class yards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input distance in feet
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        // Convert to yards and miles
        double yards = feet / 3.0;
        double miles = yards / 1760.0;

        // Output
        System.out.println("The distance in feet is " + feet +
                           ", in yards is " + yards +
                           ", and in miles is " + miles);

        sc.close();
    }
}
