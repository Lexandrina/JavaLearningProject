package md.tekwillacademy.exceptionsservicesandtask;

import org.w3c.dom.Text;

import java.io.FileNotFoundException;

public class Execution {

    public static void main(String[] args) {
        try {
            TextManager.readWithoutTryAndCatch("sasa");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
