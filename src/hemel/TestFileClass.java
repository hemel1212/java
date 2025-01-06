package hemel;

public class TestFileClass {

    public static void main(String[] args) {

        // Create a File object for the image
        java.io.File file = new java.io.File("C:\\Users\\Java Student PC-13\\Desktop\\Jahid");
//
//        // Check if the file exists
//        System.out.println("Does it exist? " + file.exists());
//
//        // Print the size of the file in bytes
//        System.out.println("The file has " + file.length() + " bytes");
//
//        // Check if the file can be read
//        System.out.println("Can it be read? " + file.canRead());
//
//        // Check if the file can be written
//        System.out.println("Can it be written? " + file.canWrite());
//
//        // Check if it's a directory
//        System.out.println("Is it a directory? " + file.isDirectory());
//
//        // Check if it's a file
//        System.out.println("Is it a file? " + file.isFile());
//
//        // Check if it's an absolute path
//        System.out.println("Is it absolute? " + file.isAbsolute());
//
//        // Check if the file is hidden
//        System.out.println("Is it hidden? " + file.isHidden());
//
//        // Print the absolute path of the file
//        System.out.println("Absolute path is " + file.getAbsolutePath());
//
//        // Print the last modified date of the file
//        System.out.println("Last modified on " + new java.util.Date(file.lastModified()));

    boolean mkdir1 = file.mkdir();


    }
}
