package md.tekwillacademy.exceptionsservicesandtask;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TextManager {
    public static int getThetextLength(String text) {
        return text.length();

    }

    public static int getTheTextlengthWithTryAndCatch(String text) {
        try {
            return text.length();
        } catch (NullPointerException exceptionObject) {
            System.out.println("There is an exception: " + exceptionObject.getMessage());
            return 0;
        } finally {
            System.out.println("This block is expected each time");
        }
    }

    public static int getTheTextLengthWithIf(String text) {
        if (text == null) {
            return 0;
        } else {
            return (text.length());
        }
    }

//    public static void readData(String filename){
//    FileReader fileReader = new FileReader(filename);
//        System.out.println("Filter reader was created");
//    }

    public static void readDataWithTryCatch(String filename) {
        try {
            FileReader fileRider = new FileReader(filename);
        } catch (FileNotFoundException e) {
            System.out.println("Continuam executia dar afisam mesajul stocat in obiectul e capturat:" + e.getMessage());
        }
        System.out.println("Filter reader was created");
    }

    public static void readWithoutTryAndCatch(String filename) throws FileNotFoundException {
        FileReader fileReader = new FileReader(filename);
        System.out.println("Filter reader was created");
    }
}