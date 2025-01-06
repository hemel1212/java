package hemel;
import java.io.File;
import java.text.SimpleDateFormat;

public class ModifiedDate {
    public static void main(String[] args) {

        String fPath = "C:\\Users\\Java Student PC-13\\Desktop\\Hemal\\Java";


        File f = new File(fPath);


        if (f.exists()) {

            long lastModified = f.lastModified();


            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedDate = sdf.format(lastModified);


            System.out.println("The f was last modified on: " + formattedDate);
        } else {
            System.out.println("The f does not exist.");
        }
    }
}
