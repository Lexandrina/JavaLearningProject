package md.tekwillacademy.filemanagementservice14;

import java.io.File;
import java.io.IOException;

public class FilesManager {
    public static boolean createTheFileIfDoesNotExist(File file) {
        try {
            return file.createNewFile();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    public static void informIfTheFileExist(File file) {
        if (file.exists()) {
            System.out.println("The file exist");
        } else {
            System.out.println("The file doesnt exist");
        }
    }

    public static void printTheFileName(File file) {
        System.out.println(file.getName());
    }

    public static void printTheAbsolutPath(File fileInput) {
        System.out.println(fileInput.getAbsoluteFile());
    }


    public static void printIfTheFileIsADirectory(File file) {
        System.out.println("The file is a directory: " + file.isDirectory());
    }

    public static void deleteTheFileIfExist(File file) {
        if (file.delete()) {
            System.out.println("The file was deleted");
        } else System.out.println("The file was not deleted!");
    }
}
