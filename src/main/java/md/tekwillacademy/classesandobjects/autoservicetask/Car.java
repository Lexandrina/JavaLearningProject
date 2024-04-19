package md.tekwillacademy.classesandobjects.autoservicetask;

public class Car {
    String make;
    int numberOfDoor;
    String colorOfTheCar;
    int motorCapacity;


    public Car(String make, String colorOfTheCar, int numberOfDoor, int motorCapacity) {
        System.out.println("This is a full constructor with all the params included");
        this.make = make;
        this.colorOfTheCar = colorOfTheCar;
        this.numberOfDoor = numberOfDoor;
        this.motorCapacity = motorCapacity;
        System.out.println("The object is created, bingo!");
    }

}
