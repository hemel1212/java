package Exam;

public class fibonacchi {




    public static void main(String args[]){

        long n1=0;
        long n2=1;
        long x;


        System.out.print(n1+" "+n2);

        for(long i=2; i<=10; i++)
        {
            x = n1+n2;
            System.out.print("   " + x);
            n1 = n2;
            n2 = x;
        }

    }
}
