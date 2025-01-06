package hemel;
import java.io.File;

public class SizeCalculator {
    public static void main(String[] args) {

        String fPath = "C:\\Users\\Java Student PC-13\\Desktop\\Hemal\\Java";


        File f = new File(fPath);


        if (f.exists()) {

            long fileSizeBytes = f.length();

            double fileSizeKB = fileSizeBytes / 1024.0;

            double fileSizeMB = fileSizeKB / 1024.0;


            System.out.println(" File size:");
            System.out.println("Bytes: " + fileSizeBytes);
            System.out.println("KB: " + String.format("%.1f", fileSizeKB));
            System.out.println("MB : " + String.format("%.1f", fileSizeMB));
        } else {
            System.out.println(" The file does not exist.");
        }
    }
}
