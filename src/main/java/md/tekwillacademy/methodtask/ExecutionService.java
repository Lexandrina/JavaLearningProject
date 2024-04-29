package md.tekwillacademy.methodtask;

import javax.xml.crypto.Data;

public class ExecutionService {
    public static void main(String[] args) {

        Customer marcelCustomer = new Customer();
        marcelCustomer.setId(DataGeneralUtil.generateRandomInt(225));
        marcelCustomer.setAge(DataGeneralUtil.generateRandomInt(42));
        marcelCustomer.setName("Marcel");
        marcelCustomer.setAddress("Str. Petricani 108");

        Customer ionelCustomer = new Customer(990, "Ionel Bujorel", 145, "Str.Bujole");
        ionelCustomer.setId(DataGeneralUtil.generateRandomInt(74));
        ionelCustomer.setName("Ionel Istrati");
        ionelCustomer.setAddress("Str. centru");
        ionelCustomer.setAge(DataGeneralUtil.generateRandomInt(115));

        System.out.println(marcelCustomer.getId());
        System.out.println(ionelCustomer.getId());
        System.out.println(ionelCustomer.getAge());

        System.out.println(DataGeneralUtil.generateRandomInt(60));
        System.out.println(DataGeneralUtil.generateRandomInt(25));
        System.out.println(DataGeneralUtil.generateRandomInt(11, 10));
//        System.out.println(DataGeneralUtil.generateRandomInt());
    }

}
