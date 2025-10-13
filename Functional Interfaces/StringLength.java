import java.util.function.Function;

public class StringLength {
    public static void main(String[] args) {
        Function<String, Integer> getLength = msg -> msg.length();
        System.out.println("Length: " + getLength.apply("Hello World"));
    }
}
