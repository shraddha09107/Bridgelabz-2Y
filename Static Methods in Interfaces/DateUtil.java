import java.text.SimpleDateFormat;
import java.util.Date;

interface DateFormatter {
    static String formatDate(String pattern) {
        return new SimpleDateFormat(pattern).format(new Date());
    }
}

public class DateUtil {
    public static void main(String[] args) {
        System.out.println(DateFormatter.formatDate("dd-MM-yyyy"));
    }
}
