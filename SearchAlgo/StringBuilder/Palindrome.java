public class Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        StringBuilder sb = new StringBuilder(s);
        if (s.equals(sb.reverse().toString()))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
