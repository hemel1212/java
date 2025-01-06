package hemel.ClassTWentyTwo;

public class SumLessThanHundred {

    public static boolean isSumLessThan100(int num1, int num2) {
        return (num1 + num2) < 100;
    }

    public static void main(String[] args) {
        int x = 70; // Example input
        int y = 50; // Example input

        boolean result = isSumLessThan100(x, y);
        System.out.println("Is the sum of " + x + " and " + y + " less than 100? " + result);
    }
}

