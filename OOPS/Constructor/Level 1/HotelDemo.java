class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default
    HotelBooking() {
        this("Guest", "Standard", 1);
    }

    // Parameterized
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy
    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    void display() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }
}

public class HotelDemo {
    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();
        HotelBooking b2 = new HotelBooking("Anishka", "Deluxe", 3);
        HotelBooking b3 = new HotelBooking(b2);

        b1.display();
        b2.display();
        b3.display();
    }
}
