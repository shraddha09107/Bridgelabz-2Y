import java.util.*;

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String id, String driver, double rate) { this.vehicleId = id; this.driverName = driver; this.ratePerKm = rate; }
    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public void getVehicleDetails() {
        System.out.println("Vehicle " + vehicleId + " driven by " + driverName + " rate/km " + ratePerKm);
    }

    public abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String loc);
}

class Car extends Vehicle implements GPS {
    private String location = "Unknown";
    public Car(String id, String d, double r) { super(id,d,r); }
    @Override public double calculateFare(double distance) { return getRatePerKm() * distance + 30; } // base fare
    @Override public String getCurrentLocation() { return location; }
    @Override public void updateLocation(String loc) { location = loc; }
}

class Bike extends Vehicle implements GPS {
    private String location = "Unknown";
    public Bike(String id, String d, double r) { super(id,d,r); }
    @Override public double calculateFare(double distance) { return getRatePerKm() * distance; }
    @Override public String getCurrentLocation() { return location; }
    @Override public void updateLocation(String loc) { location = loc; }
}

class Auto extends Vehicle implements GPS {
    private String location = "Unknown";
    public Auto(String id, String d, double r) { super(id,d,r); }
    @Override public double calculateFare(double distance) { return Math.max(40, getRatePerKm()*distance); } // min fare
    @Override public String getCurrentLocation() { return location; }
    @Override public void updateLocation(String loc) { location = loc; }
}

public class RideHailing {
    public static void main(String[] args) {
        List<Vehicle> options = Arrays.asList(new Car("CAR01","Sami",20), new Bike("BIKE01","Rekha",10), new Auto("AUTO01","Vik",8));
        double distance = 12.5;
        for (Vehicle v : options) {
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));
            if (v instanceof GPS) {
                ((GPS) v).updateLocation("MG Road");
                System.out.println("Location: " + ((GPS)v).getCurrentLocation());
            }
            System.out.println("---");
        }
    }
}
