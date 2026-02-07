public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3};
        int key = 2;

        int low = 0, high = arr.length - 1, result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        System.out.println(result);
    }
}
