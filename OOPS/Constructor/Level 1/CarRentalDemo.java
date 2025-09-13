class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    static final double DAILY_RATE = 1500; // flat rate per day

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }
}

public class CarRentalDemo {
    public static void main(String[] args) {
        CarRental rental = new CarRental("Ishka", "Hyundai Creta", 5);
        rental.display();
    }
}
