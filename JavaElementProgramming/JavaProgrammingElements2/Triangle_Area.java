package labnew.JavaProgrammingElements.JavaProgrammingElements1;
import java.util.Scanner;

public class Triangle_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (cm): ");
        double base = sc.nextDouble();

        System.out.print("Enter height (cm): ");
        double height = sc.nextDouble();

        double areaCm2 = 0.5 * base * height;
        double areaIn2 = areaCm2 / 6.4516;

        System.out.println("The Area of the triangle in sq in is " + areaIn2 + " and sq cm is " + areaCm2);

        sc.close();
    }
}

