package md.tekwillacademy.operationsandciclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        //sum of the number from 0 to 1000
        int totalSum = 0;

        for (int i = 0; i <= 1000; i++) {
            System.out.println("iterator: " + i);
            if (i % 2 == 1) {
                totalSum = totalSum + i;
                System.out.println("Total sum: " + totalSum);
                //System.out.println("Iterator : " + i);
            }
        }
        System.out.println("Total sum last: " + totalSum);

        for (int i = 1; i <= 10; i += 2) {
            System.out.println("i= :" + i);

            int a = 0;
            for (a = 0; a < 10; a++) {
                System.out.println(a + " ");
            }
        }

        // new implementation
        int a = 90;
        int limit = 100;
        while (a > 0) {
            System.out.println(a + ", ");
            a--;
        }
        //Valoarea lui a dupa ce iese din ciclu while este 0
        System.out.println();

        do {
            System.out.println(a + ", ");
            a++;
        } while (a < limit);
        System.out.println();
        for (int i = 1; i <= limit; i++) {
            if ((i % 2) == 0) {
                System.out.println(i + ", ");
            } else {
                System.out.println("[], ");
            }
        }
    }
}
