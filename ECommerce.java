import java.util.*;

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.productId = id; this.name = name; this.price = price;
    }

    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public abstract double calculateDiscount(); // amount
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(String id, String name, double price) { super(id,name,price); }
    @Override public double calculateDiscount() { return getPrice() * 0.10; } // 10% off
    @Override public double calculateTax() { return getPrice() * 0.18; } // 18% GST-like
    @Override public String getTaxDetails() { return "Electronics tax: 18%"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(String id, String name, double price) { super(id,name,price); }
    @Override public double calculateDiscount() { return getPrice() > 1000 ? 150 : 50; } // simple slab
    @Override public double calculateTax() { return getPrice() * 0.12; } // 12%
    @Override public String getTaxDetails() { return "Clothing tax: 12%"; }
}

class Groceries extends Product {
    public Groceries(String id, String name, double price) { super(id,name,price); }
    @Override public double calculateDiscount() { return 0.0; } // no discount
}

public class ECommerce {
    public static void printFinalPrices(List<Product> list) {
        for (Product p : list) {
            double price = p.getPrice();
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0.0;
            double finalPrice = price + tax - discount;
            System.out.println(p.getName() + " -> base:" + price + ", tax:" + tax + ", discount:" + discount + ", final:" + finalPrice);
        }
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Electronics("E01","Smartphone",20000),
            new Clothing("C01","Jacket",2500),
            new Groceries("G01","Rice 5kg",400)
        );
        printFinalPrices(products);
    }
}
