class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: ₹" + price);
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("The Alchemist", "Paulo Coelho", 399);

        b1.displayDetails();
        b2.displayDetails();
    }
}
