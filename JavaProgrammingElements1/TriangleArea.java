package labnew.JavaProgrammingElements.JavaProgrammingElements1;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, height;

        System.out.print("Enter base (in cm): ");
        base = input.nextDouble();
        System.out.print("Enter height (in cm): ");
        height = input.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / 6.4516;

        System.out.println("The area of triangle is " + areaCm + " cm² and " + areaInches + " in²");
    }
}
