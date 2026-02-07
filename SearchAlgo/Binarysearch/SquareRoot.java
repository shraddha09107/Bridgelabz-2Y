public class SquareRoot {
    public static void main(String[] args) {
        int n = 25;
        int low = 0, high = n, ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid <= n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
