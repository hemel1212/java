package ScondClass;

import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {

        int[] mun = {2, 8, 5, 8, 9, 2, 7, 8, 8, 1,};


        findDuplicates(mun);
    }


    public static void findDuplicates(int[] array) {

        HashSet<Integer> see = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();


        for (int num : array) {

            if (!see.add(num)) {
                dup.add(num);
            }
        }


        if (dup.isEmpty()) {
            System.out.println("No dup found.");
        } else {
            System.out.println("Duplicate values in the array:");
            for (int duplicate : dup) {
                System.out.println(duplicate);
            }
        }
    }
}

