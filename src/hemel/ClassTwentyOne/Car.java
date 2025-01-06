package hemel.ClassTwentyOne;

class Car extends Vehicle {
    @Override
    public void speedUp() {
        speed += 20; // Car-specific speed increment
        System.out.println("Car speed increased by 20. Current speed: " + speed + " km/h");
    }
}