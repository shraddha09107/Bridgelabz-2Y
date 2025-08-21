package labnew.JavaProgrammingElements.JavaProgrammingElements1;
import java.util.Scanner;

public class TotalPurchase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the unit price: ");
        double unitPrice = input.nextDouble();
        
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();
        
        double total = unitPrice * quantity;
        
        System.out.println("The Total Price for " + quantity + " items is: INR " + total);
    }
}
