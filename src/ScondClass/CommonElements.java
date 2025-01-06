package ScondClass;

import java.util.HashSet;

public class CommonElements {
    public static void main(String[] args) {

            String[] x = {"apple", "samsung", "oneplus", "apple", "samsung",  "google", "oppo"};

        CommonElements(x);
        }

        public static void CommonElements(String[] array) {

            HashSet<String> see = new HashSet<>();
            HashSet<String> common = new HashSet<>();


            for (String n : array) {

                if (!see.add(n)) {
                    common.add(n);
                }
            }


            if (common.isEmpty()) {
                System.out.println("No common found.");
            } else {
                System.out.println("Element values in the array:");
                for (String elements : common) {
                    System.out.println(elements);
                }
            }
        }
    }
