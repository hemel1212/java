package hemel.ClassTwentyOne;

class Bicycle extends Vehicle {
    @Override
    public void speedUp() {
        speed += 2;
        System.out.println("Bicycle speed increased by 2. Current speed: " + speed + " km/h");
    }
}
