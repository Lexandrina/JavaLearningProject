package md.tekwillacademy.operationsandciclicfunctions;

public class AssignmentOperationExample {
    public static void main(String[] args) {
        int a = 45;
        int b = 40;

        //Atribuire simpla
        int result = a;
        System.out.println("Atribuire simpla: " + result);

        //Atribuire cu adunare
        //result = result +b;
        result += b;
        System.out.println("Atribuire cu adunare: " +result);

        //Atribuire cu scadere
        //result = result -b;
        result -= a;
        System.out.println("Atribuire cu scadere: " + result);

        //Atribuire cu imultire
        //result = result * b;
        result *=5;
        System.out.println("Atribuire cu imultire: " + result);

        //Atribuire cu impartire
        //result = result / b;
        result /= 10;
        System.out.println("Atribuire cu impartire: " + result);


        //Atribuire cu restul impartire
        //result = result % b;
        result %= a;
        System.out.println("Atribuire cu restul impartire: " + result);
    }
}
