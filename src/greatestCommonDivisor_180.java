import java.util.Scanner;

public class greatestCommonDivisor_180 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int x = input.nextInt();
        System.out.print("Enter second integer: ");
        int y = input.nextInt();

        int gcd = 1;
        int k = 2;
        while (k<=x && k<=y){
            if (x%k == 0 && y%k == 0)


             gcd = k;
             k++;

        }
        System.out.println("The greatest common divisor for "
                + x +" and "+ y +" is "+ gcd);
    }
}