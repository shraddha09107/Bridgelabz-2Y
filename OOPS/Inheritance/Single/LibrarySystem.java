package Single;
class Book {
    String title;
    int publicationYear;

    // Constructor
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author
class Author extends Book {
    String name;
    String bio;

    // Constructor using super
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Call superclass constructor
        this.name = name;
        this.bio = bio;
    }

    // Overriding displayInfo()
    @Override
    void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Main class
public class LibrarySystem {
    public static void main(String[] args) {
        Author book1 = new Author("AI for Beginners", 2023, "Ishka", "Machine Learning Enthusiast & Author");
        book1.displayInfo();
    }
}
