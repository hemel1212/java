package hemel.ClassTwentyOne;


public class Main {
    public static void main(String[] args) {

        Vehicle genericVehicle = new Vehicle();
        genericVehicle.speedUp();


        Car car = new Car();
        car.speedUp();


        Bicycle bicycle = new Bicycle();
        bicycle.speedUp();
        System.out.println("hemel");
    }
}