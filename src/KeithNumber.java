import java.util.*;

public class KeithNumber {

    public static boolean isKeithNumber(int number) {
        List<Integer> digits = new ArrayList<>();
        int temp = number;
        while (temp > 0) {
            digits.add(0, temp % 10);
            temp /= 10;
        }

        int numDigits = digits.size();
        List<Integer> sequence = new ArrayList<>(digits);


        while (true) {
            int sum = 0;

            for (int i = sequence.size() - numDigits; i < sequence.size(); i++) {
                sum += sequence.get(i);
            }


            if (sum == number) {
                return true;
            }


            if (sum > number) {
                return false;
            }


            sequence.add(sum);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number to check if it is a Keith number: ");
        int number = scanner.nextInt();


        if (isKeithNumber(number)) {
            System.out.println(number + " is a Keith number.");
        } else {
            System.out.println(number + " is not a Keith number.");
        }

        scanner.close();
    }
}
