public class Count {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 4};
        int key = 2, count = 0;

        for (int num : arr) {
            if (num == key) count++;
        }
        System.out.println(count);
    }
}
