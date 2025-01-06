package hemel.ClassTwentyOne;

class Vehicle {
    int speed;

    // Method to be overridden
    public void speedUp() {
        speed += 5; // Default increment
        System.out.println("Vehicle speed increased by 5. Current speed: " + speed + " km/h");
    }
}