public class Multiplication_176{
    public static void main(String[] args) {
        System.out.println("           Multiplication Table");
        System.out.print("       ");
        for (int i = 1; i<=9; i++)
            System.out.print("  "+i);
        System.out.println("\n.................................................");


        for (int x = 1; x<=9; x++){
            System.out.print(x+" | ");
            for (int j = 1; j<=9; j++){
                System.out.printf("%5d", x*j);
            }
            System.out.println();
        }

    }
}
