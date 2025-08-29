public class TableSixToNine {
    public static void main(String[] args) {
        int[] results = new int[4 * 10];
        int index = 0;
        for (int num = 6; num <= 9; num++) {
            for (int i = 1; i <= 10; i++) {
                results[index++] = num * i;
                System.out.println(num + " * " + i + " = " + (num * i));
            }
            System.out.println();
        }
    }
}
