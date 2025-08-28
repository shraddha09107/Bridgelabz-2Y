import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) System.out.println(num + " is Positive Even");
                else System.out.println(num + " is Positive Odd");
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }
        if (numbers[0] == numbers[4]) System.out.println("First and last are Equal");
        else if (numbers[0] > numbers[4]) System.out.println("First is Greater than Last");
        else System.out.println("First is Less than Last");
    }
}
