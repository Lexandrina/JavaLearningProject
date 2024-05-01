package md.tekwillacademy.operationsandciclicfunctions;

import java.sql.SQLOutput;

public class LogicalOperationsExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean result = a && b;
        System.out.println("Logic and: " + result);

        //a = true
        a = result && b;

        //a = false
        System.out.println("Logic and: " + a);

        result = a || b;
        System.out.println("Logic or: " + result);
        System.out.println("Negation: " + !!!result);

        System.out.println(((876 % 5) > 1) && (true));
        System.out.println(!((876 % 5) > 1) && (true));
        System.out.println(false || (365 % 5) <= 0);

    }
}
