class Product implements Cloneable {
    int id = 1;
    String name = "Phone";

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product p1 = new Product();
        Product p2 = (Product) p1.clone();
        System.out.println(p2.name);
        System.out.println(p2.id);
    }
}
