public class InsertDelete {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.insert(4, " Programming");
        sb.delete(0, 4);
        System.out.println(sb);
    }
}
