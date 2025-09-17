import java.util.*;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String id, String title, String author) { this.itemId=id; this.title=title; this.author=author; }
    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public void getItemDetails() {
        System.out.println("ID:" + itemId + ", Title:" + title + ", Author:" + author);
    }

    public abstract int getLoanDuration(); // days
}

interface Reservable {
    boolean reserveItem(String borrower);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;
    private String reservedBy = null;
    public Book(String id, String t, String a) { super(id,t,a); }
    @Override public int getLoanDuration() { return 21; }
    @Override public boolean reserveItem(String borrower) {
        if (available) { available=false; reservedBy=borrower; return true; }
        return false;
    }
    @Override public boolean checkAvailability() { return available; }
}

class Magazine extends LibraryItem {
    public Magazine(String id, String t, String a) { super(id,t,a); }
    @Override public int getLoanDuration() { return 7; }
}

class DVD extends LibraryItem {
    public DVD(String id, String t, String a) { super(id,t,a); }
    @Override public int getLoanDuration() { return 3; }
}

public class LibraryManagement {
    public static void main(String[] args) {
        List<LibraryItem> items = Arrays.asList(
            new Book("B001","Java Basics","A. Author"),
            new Magazine("M001","Time","Editorial"),
            new DVD("D001","Inception","Nolan")
        );
        for (LibraryItem it : items) {
            it.getItemDetails();
            System.out.println("Loan days: " + it.getLoanDuration());
            System.out.println("---");
        }
        // demonstrate reservation
        Book book = (Book) items.get(0);
        System.out.println("Available before reserve: " + book.checkAvailability());
        System.out.println("Reserving: " + book.reserveItem("Anishka"));
        System.out.println("Available after reserve: " + book.checkAvailability());
    }
}
