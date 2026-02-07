import java.util.*;

public class QuickSortNaive {

    static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int[] temp = new int[right - left + 1];
        int k = 0;

        for (int i = left; i <= right; i++)
            if (arr[i] < pivot)
                temp[k++] = arr[i];

        int pivotIndex = left + k;
        temp[k++] = pivot;

        for (int i = left; i <= right; i++)
            if (arr[i] > pivot)
                temp[k++] = arr[i];

        for (int i = left; i <= right; i++)
            arr[i] = temp[i - left];

        return pivotIndex;
    }

    static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int p = partition(arr, left, right);
            quickSort(arr, left, p - 1);
            quickSort(arr, p + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 8, 1, 6};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
