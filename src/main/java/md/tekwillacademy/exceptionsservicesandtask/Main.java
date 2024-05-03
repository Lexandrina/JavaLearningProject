package md.tekwillacademy.exceptionsservicesandtask;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args)  {
        System.out.println(TextManager.getThetextLength("mama"));
        System.out.println(TextManager.getTheTextlengthWithTryAndCatch(null));
        System.out.println(TextManager.getThetextLength("tata"));
        System.out.println(TextManager.getTheTextlengthWithTryAndCatch("Alexandrina test"));

        TextManager.readDataWithTryCatch("file.txt");

        try{
            TextManager.readWithoutTryAndCatch("text.txt");
        }catch (FileNotFoundException)

        System.out.println("Last Line");

        System.out.println(ArithmeticOperationsService.divideWithoutExceptionHandling());
        System.out.println("The show must go on");
    }
}
