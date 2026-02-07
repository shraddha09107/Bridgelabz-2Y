public class RemoveVowels {
    public static void main(String[] args) {
        String s = "education";
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!"aeiouAEIOU".contains(c + ""))
                sb.append(c);
        }
        System.out.println(sb);
    }
}
