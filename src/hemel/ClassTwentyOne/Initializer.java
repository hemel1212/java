package hemel.ClassTwentyOne;

public class Initializer {

    static int initialValue;


    static {
        initialValue = 1000;
        System.out.println("check value");
    }


    public static void main(String[] args) {

        System.out.println("Value of initialValue before creating an instance: " + initialValue);


        Initializer initializerInstance = new Initializer();
       int x = initializerInstance.initialValue;

        // Print the value of 'initialValue' after creating an instance
        System.out.println("Value of initialValue after creating an instance: " + x);
    }


}
