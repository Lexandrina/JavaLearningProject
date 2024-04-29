package md.tekwillacademy.methodtask;

import javax.swing.*;
import java.security.PublicKey;

public class Customer {
    private int id;
    private String name;
    private int age;
    private String address;


    public Customer(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Customer() {
    }

    //Setters
    public void setId(int idFormalParam) {
        id = idFormalParam;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int ageInput) {
        if ((ageInput > 0 ) && (ageInput<= 115)){
            age = ageInput;
        } else {
            System.out.println("The property is not valid, please add another value: ");
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }


   //Getters
    public int getId() {
        return this.id;
    }

    public int getAge(){
        return this.age;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
