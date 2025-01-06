import java.util.Scanner;

 public class ClassThree {
    public static void main(String[] args) {
        String name = "name";
        name = "update name";

      System.out.println(name);

        Scanner s =  new Scanner(System.in);
        System.out.print("Give year here: ");
        int year = s.nextInt();

        if(year%4 == 0){
           System.out.println("leap year: "+ year);
         }else {
             System.out.println(year + " is not leap year");
         }



         ifmoth(s);

          scaseE(s);


          scaseEX(s);




    }

     private static void ifmoth(Scanner s) {
         System.out.print("Give year month number: ");
         int monthInNumer = s.nextInt();

         if (monthInNumer == 1) {
             System.out.println("January");
         } else if (monthInNumer == 2) {
             System.out.println("February");
         } else if (monthInNumer == 3) {
             System.out.println("March");
         } else if (monthInNumer == 4) {
             System.out.println("April");
         } else if (monthInNumer == 5) {
             System.out.println("May");
         } else if (monthInNumer == 6) {
             System.out.println("Jun");
         } else if (monthInNumer == 7) {
             System.out.println("July");
         } else if (monthInNumer == 8) {
             System.out.println("August");
         } else if (monthInNumer == 9) {
             System.out.println("September");
         } else if (monthInNumer == 10) {
             System.out.println("October");
         } else if (monthInNumer == 11) {
             System.out.println("November");
         } else if (monthInNumer == 12) {
             System.out.println("December");
         } else {
             System.out.println("This is not valid");
         }
     }

     private static void scaseE(Scanner s) {
         System.out.print("Give year month number: ");
         int month = s.nextInt();

         switch (month){
             case 1 -> System.out.println("January");
             case 2 -> System.out.println("February");
             case 3 -> System.out.println("March");
             case 4 -> System.out.println("April");
             case 5 -> System.out.println("May");
             case 6 -> System.out.println("Jun");
             case 7 -> System.out.println("July");
             case 8 -> System.out.println("August");
             case 9 -> System.out.println("September");
             case 10 -> System.out.println("October");
             case 11 -> System.out.println("November");
             case 12 -> System.out.println("December");
             default -> System.out.println("n");

         }
     }

     private static void scaseEX(Scanner s) {
         System.out.print("Give year month number: ");
         int month_2 = s.nextInt();

         switch (month_2) {
             case 1:
                 System.out.println("January");
                 break;
             case 2:
                 System.out.println("February");
                 break;
             case 3:
                 System.out.println("March");
                 break;
             case 4:
                 System.out.println("April");
                 break;
             case 5:
                 System.out.println("May");
                 break;
             case 6:
                 System.out.println("Jun");
                 break;
             case 7:
                 System.out.println("July");
                 break;
             case 8:
                 System.out.println("August");
                 break;
             case 9:
                 System.out.println("September");
                 break;
             case 10:
                 System.out.println("October");
                 break;
             case 11:
                 System.out.println("November");
                 break;
             case 12:
                 System.out.println("December");
                 break;
             default:
                 System.out.println("n");

         }




     }



 }


