// Superclass: Device
class Device {
    String deviceId;
    String status;

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass: Thermostat
class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status); // Call parent constructor
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus(); // Show base device info
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class
public class SmartHomeSystem {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("Thermo-01", "ON", 24);
        t1.displayStatus();
    }
}
