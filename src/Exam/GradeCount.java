package Exam;
import java.util.Scanner;

public class GradeCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();


        if (marks<0 || marks>100) {
            System.out.println("Invalid input. Marks must be between 0 to 100.");
        }
        else if (marks >= 90) {
            System.out.println("You got : A+");
        } else if (marks >= 70) {
            System.out.println("You got : A");
        } else if (marks >= 60) {
            System.out.println("You got : B");
        } else if(marks>=0 ) {
            System.out.println("Your are Failed.");
        }

        sc.close();
    }
}