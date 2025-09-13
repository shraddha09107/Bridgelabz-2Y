class Vehicle {
    static double registrationFee = 5000.0;
    final String registrationNumber;
    String ownerName, vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Type: " + vehicleType);
            System.out.println("Registration No: " + registrationNumber);
            System.out.println("Fee: " + registrationFee);
        }
    }
}

public class Main6 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ishka", "Car", "UP1234");
        v1.displayVehicleDetails();

        Vehicle.updateRegistrationFee(6000);
        v1.displayVehicleDetails();
    }
}
