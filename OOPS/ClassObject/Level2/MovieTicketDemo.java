class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }
}

public class MovieTicketDemo {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket();
        ticket1.bookTicket("Avengers: Endgame", "A12", 350.0);
        ticket1.displayTicket();
    }
}
