package ScondClass;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DeleteFolderExample {

    public static void main(String[] args) {
        Path folderPath = Paths.get("path/to/your/folder");

        try {
            // Recursively delete folder and its contents
            Files.walkFileTree(folderPath, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    Files.delete(file);  // Delete file
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                    Files.delete(dir);  // Delete the directory after its contents
                    return FileVisitResult.CONTINUE;
                }
            });
            System.out.println("Folder deleted successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error deleting folder: " + e.getMessage());
        }
    }
}

