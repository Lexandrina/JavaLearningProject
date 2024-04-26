package md.tekwillacademy.operationsandciclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        //sum of the number from 0 to 1000

        int totalSum = 0;

        for (int i = 0; i<=1000; i++){
            System.out.println("iterator: " + i);
            if (i % 2 ==1) {
                totalSum = totalSum + i;
                System.out.println("Total sum: " + totalSum);
                //System.out.println("Iterator : " + i);
            }
        }
        System.out.println("Total sum last: " + totalSum);

        for (int i = 1; i <=10; i +=2){
            System.out.println("i= :" +i);



            int a = 0;
            for (a=0; a < 10; a++){
                System.out.println(a + " ");
            }

//            int b = 0;
//            for(; b < 0;){
//                System.out.println(+b);
//                b+ = 2;
//            }
        }
    }
}
