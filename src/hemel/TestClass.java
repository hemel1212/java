package hemel;

public class TestClass {

    public static void main(String[] args) {


        int j = 0;

        try {

            if (j!=0){

            }else{
                throw new HemelException("This is my custom exception for false result");
            }

        }catch (HemelException e) {
            System.out.println("The exception is: "+ e);
        }

    }
}