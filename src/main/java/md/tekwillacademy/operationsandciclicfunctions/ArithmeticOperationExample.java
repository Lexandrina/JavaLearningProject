package md.tekwillacademy.operationsandciclicfunctions;

public class ArithmeticOperationExample {
    public static void main(String[] args) {
        int a = 48;
        int b = 10;

        //Sum
        int sum = a + b;
        System.out.println("Adunarea: "+ sum);
        System.out.println("Suma:" + (a + b));

        //Subtraction
        int sub = a - b;
        System.out.println("Subtraction Result: " + sub);

        //Multiplication
        int result = a * b;
        System.out.println("Multiplication Result: " + result);

        //Division
        double result1 = (double) b / a;
        System.out.println("Division Result: " + result1);

        //The rest of division of Division with remainder
        int result2 = a % b;
        System.out.println("Division Result: " + result2);
    }
}
