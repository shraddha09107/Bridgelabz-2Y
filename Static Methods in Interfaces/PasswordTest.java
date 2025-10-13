interface SecurityUtils {
    static boolean checkPassword(String pwd) {
        return pwd.length() >= 8 && pwd.matches(".*[A-Z].*") && pwd.matches(".*[0-9].*");
    }
}

public class PasswordTest {
    public static void main(String[] args) {
        System.out.println(SecurityUtils.checkPassword("Pass1234"));
    }
}
