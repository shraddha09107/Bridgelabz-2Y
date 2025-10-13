import java.util.function.Predicate;

public class TempAlert {
    public static void main(String[] args) {
        Predicate<Double> isHot = temp -> temp > 40.0;
        double t = 42.5;
        System.out.println(isHot.test(t) ? "ALERT: Too Hot!" : "Temperature Normal");
    }
}
