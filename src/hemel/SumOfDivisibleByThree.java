package hemel;

public class SumOfDivisibleByThree {
    public static void main(String[] args) {
        int sum = 0;
        int i;
        for ( i = 0; i <= 100; i = i+ 10) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                sum= sum + i;

            }
        }
        System.out.println("sum of number "+sum);

        for (i = 1; i <= 50; i++) {
            System.out.println("Value of i is " + i);
            if (i % 3 == 0) {

                sum += i;
            }
        }
    }
}