import library.books.*;
import library.members.*;
import library.transactions.*;

public class MainApp4 {
    public static void main(String[] args) {
        Book b = new Book("Java Mastery", "James Gosling");
        Member m = new Member("Shraddha");
        Transaction t = new Transaction();

        b.showBook();
        m.showMember();
        t.issue(b, m);
    }
}
