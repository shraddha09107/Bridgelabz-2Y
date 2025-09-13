class Book {
    public String ISBN;       // public
    protected String title;   // protected
    private String author;    // private

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public getter & setter for private author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

// Subclass to access public + protected
class EBook extends Book {
    String fileFormat;

    EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor() + ", Format: " + fileFormat);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        EBook ebook = new EBook("978-1234567890", "Java Basics", "Herbert Schildt", "PDF");
        ebook.display();
    }
}
