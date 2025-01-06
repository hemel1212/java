package hemel.ClassTWentyTwo;

import java.util.Arrays;

public class ArrayOfInteger {
    public static void main(String[] args) {
        int[] array =  {2, 5, 6, 20, 80, 5, 19, 25, 12, 15, 18};
        Arrays.sort(array);



        int different = differentSumOfEnO(array);
        System.out.println("Different between sum of even and odd: "+different);
    }

    public static int differentSumOfEnO(int[] array){
        int sumOfE = 0;
        int sumOfO = 0;
        for (int i: array){
            if (i%2==0){
                sumOfE+=i;
            }else {
                sumOfO+=i;
            }

        }
        System.out.println(array);
        System.out.println("Sum of even number: "+sumOfE);
        System.out.println("Sum of odd number: "+sumOfO);
        return sumOfE -sumOfO;
    }
}
