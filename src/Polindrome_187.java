import java.util.Scanner;

class Polindromes_187 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String x = s.nextLine();

        int low = 0;

        int high = x.length() - 1;
        boolean Pali = true;
        while (low < high){
            if (x.charAt(low) != x.charAt(high)){
                Pali = false;
                break;
            }
            low++;
            high--;
        }
        if (Pali){
            System.out.println(x + " is a palindrome");
        }else{
            System.out.println(x + " is not a palindrome");
        }
    }
}