import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate; // per day

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber; this.type = type; this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }
    public void setRentalRate(double rate) { this.rentalRate = rate; }

    public abstract double calculateRentalCost(int days);

    public void display() {
        System.out.println(type + " #" + vehicleNumber + " rate/day=" + rentalRate);
    }
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private double insuranceFactor = 0.05; // 5% of rental total
    public Car(String num, double rate) { super(num,"Car",rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days; }
    @Override public double calculateInsurance() { return getRentalRate() * insuranceFactor; }
    @Override public String getInsuranceDetails() { return "Car insurance factor 5% per day rate"; }
}

class Bike extends Vehicle {
    public Bike(String num, double rate) { super(num,"Bike",rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days * 0.8; } // discount
}

class Truck extends Vehicle implements Insurable {
    private double truckInsurance = 200; // flat per rental
    public Truck(String num, double rate) { super(num,"Truck",rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days + 500; } // extra charge
    @Override public double calculateInsurance() { return truckInsurance; }
    @Override public String getInsuranceDetails() { return "Truck flat insurance per rental"; }
}

public class VehicleRental {
    public static void main(String[] args) {
        List<Vehicle> fleet = Arrays.asList(new Car("KA01A0001",2000), new Bike("KA01B0002",400), new Truck("KA01T0003",5000));
        for (Vehicle v : fleet) {
            v.display();
            int days = 3;
            System.out.println("Rental cost for " + days + " days: " + v.calculateRentalCost(days));
            if (v instanceof Insurable) {
                System.out.println("Insurance: " + ((Insurable)v).calculateInsurance() + " (" + ((Insurable)v).getInsuranceDetails() + ")");
            }
            System.out.println("---");
        }
    }
}
