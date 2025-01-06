package hemel;

import java.io.*;
import java.util.Scanner;

public class fileReader {

    public static void main(String[] args) {

        String fPath = "C:\\Users\\Java Student PC-13\\Desktop\\New Text Document.txt";

                File f = new File(fPath);

        try ( Scanner sc = new Scanner(f)){

            while (sc.hasNextLine()){
                String dataT = sc.nextLine();
                System.out.println(dataT);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }


}
