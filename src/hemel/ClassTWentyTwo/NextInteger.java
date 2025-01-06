package hemel.ClassTWentyTwo;

import java.util.Scanner;

public class NextInteger {
    public static int getNextNumber(int number) {
        return number + 1;
    }

    public static void main(String[] args) {
        System.out.print("enter your number: ");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int nextNumber = getNextNumber(x);
        System.out.println("The next number after " + x + " is " + nextNumber);
    }
}
