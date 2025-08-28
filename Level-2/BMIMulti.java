import java.util.Scanner;

public class BMIMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] personData = new double[n][3];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = w / (h * h);
            if (personData[i][2] < 18.5) status[i] = "Underweight";
            else if (personData[i][2] < 25) status[i] = "Normal";
            else if (personData[i][2] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Height: " + personData[i][1] + " Weight: " + personData[i][0] + " BMI: " + personData[i][2] + " Status: " + status[i]);
        }
    }
}
