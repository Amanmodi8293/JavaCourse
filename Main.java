
// Base class
class Device {
     String brand;
     String model;
     boolean isPoweredOn;

    // Constructor
    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.isPoweredOn = false;
    }

    // Method to power on the device
    public void powerOn() {
        if (!isPoweredOn) {
            isPoweredOn = true;
            System.out.println(brand + " " + model + " is now powered on.");
        } else {
            System.out.println(brand + " " + model + " is already powered on.");
        }
    }

    // Method to power off the device
    public void powerOff() {
        if (isPoweredOn) {
            isPoweredOn = false;
            System.out.println(brand + " " + model + " is now powered off.");
        } else {
            System.out.println(brand + " " + model + " is already powered off.");
        }
    }

    // Method to display device information
    public void displayInfo() {
        System.out.println("Device Brand: " + brand + ", Model: " + model);
    }
}

// Derived class
class Smartphone extends Device {
     String operatingSystem;
     String cameraResolution;

    // Constructor
    public Smartphone(String brand, String model, String operatingSystem, String cameraResolution) {
        super(brand, model); // Call to the parent constructor
        this.operatingSystem = operatingSystem;
        this.cameraResolution = cameraResolution;
    }

    // Method to take a photo
    public void takePhoto() {
        if (super.isPoweredOn) {
            System.out.println("Taking a photo with " + cameraResolution + " camera on " + super.brand + " " + super.model + ".");
        } else {
            System.out.println("Cannot take a photo. " + super.brand + " " + super.model + " is powered off.");
        }
    }

    // Method to display smartphone-specific information
    public void displaySmartphoneInfo() {
        displayInfo(); // Call to parent method
        System.out.println("Operating System: " + operatingSystem + ", Camera Resolution: " + cameraResolution);
    }
}

// Main class to demonstrate functionality
public class Main {
    public static void main(String[] args) {
        // Create an instance of Smartphone
        Smartphone mySmartphone = new Smartphone("Apple", "iPhone 14", "iOS", "12 MP");

        // Set attributes and demonstrate the usage of methods
        mySmartphone.displaySmartphoneInfo(); // Display initial info
        mySmartphone.powerOn();                // Power on the device
        mySmartphone.takePhoto();              // Take a photo
        mySmartphone.powerOff();               // Power off the device
    }
}
