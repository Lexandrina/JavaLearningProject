package md.tekwillacademy.operationsandciclicfunctions;

import java.sql.SQLOutput;

public class LogicalOperationsExample {
    public static void main(String[] args) {
        System.out.println(((876 % 5) > 1) && (true));

        System.out.println(!((876 % 5) > 1) && (true));
        System.out.println(false || (365 % 5)<= 0);

    }
}
