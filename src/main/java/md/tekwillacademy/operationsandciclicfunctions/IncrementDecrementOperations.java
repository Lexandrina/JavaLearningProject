package md.tekwillacademy.operationsandciclicfunctions;

public class IncrementDecrementOperations {
    public static void main(String[] args) {
        int a = 5;

        //Incrementare a++
        int result = a++;
        System.out.println("Result : " + result);
        System.out.println("Valoarea dupa incrementare : " + a);

        //Incrementare pre-fixata ++a
        a = 7;
        result = ++a;
        System.out.println("Result :" + result);
        System.out.println("Valoarea dupa incrementarea pre-fixata: " + a);

        //Decrementare a--
        a = 8;
        result = a--;
        System.out.println("Result :" + result);
        System.out.println("Valoarea dupa decrementare: " + a);

        //Decrementare pre-fixata --a
        a = 9;
        result = --a;
        System.out.println("Result :" + result);
        System.out.println("Valoarea dupa decrementarea pre-fixata: " + a);
    }
}
