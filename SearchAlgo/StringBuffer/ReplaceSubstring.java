public class ReplaceSubstring {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("I love Java");
        sb.replace(7, 11, "Python");
        System.out.println(sb);
    }
}
