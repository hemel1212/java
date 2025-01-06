package Exam;

import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter your first number: ");
        int x = sc.nextInt();

        System.out.print("Enter your second number: ");
        int y = sc.nextInt();

        System.out.print("Enter your third number: ");
        int z = sc.nextInt();


        int highest = Math.max(x, Math.max(y, z));
        int lowest = Math.min(x, Math.min(y, z));


        System.out.println("The highest number is: " + highest);
        System.out.println("The lowest number is: " + lowest);

        sc.close();
    }
}
