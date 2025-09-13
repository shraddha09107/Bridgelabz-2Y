class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: ₹" + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class InventoryDemo {
    public static void main(String[] args) {
        Item i1 = new Item(101, "Notebook", 45.50);
        i1.displayItem();
        System.out.println("Total Cost for 5 items: ₹" + i1.calculateTotalCost(5));
    }
}
