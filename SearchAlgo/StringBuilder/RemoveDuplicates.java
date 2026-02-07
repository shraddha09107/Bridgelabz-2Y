public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "programming";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (sb.indexOf(String.valueOf(s.charAt(i))) == -1)
                sb.append(s.charAt(i));
        }
        System.out.println(sb);
    }
}
