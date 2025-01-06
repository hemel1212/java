package Exam;

import java.util.Scanner;

public class PositiveIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter a sequence number when get negative number to stop:");

        while (true) {
            int number = sc.nextInt();

            if (number < 0) {
                break;
            }

            sum += number;
        }

        System.out.println("The sum of positive integers is: " + sum);
        sc.close();
    }
}
