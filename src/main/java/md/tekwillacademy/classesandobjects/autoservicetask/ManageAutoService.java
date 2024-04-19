package md.tekwillacademy.classesandobjects.autoservicetask;

import java.net.HttpURLConnection;

public class ManageAutoService {
    public static void main(String[] args) {

        Garage masterLuxObject = new Garage("str. Orheiului 162", 3, 120);
        System.out.println(masterLuxObject.address);

        Garage autoLux = new Garage();
        System.out.println(autoLux.numberOfBoxes);
        System.out.println(autoLux.address);
        System.out.println(autoLux.dimensionSqFt);

        autoLux.address = "Str. Chisinaului";
        autoLux.dimensionSqFt = 256.6;
        autoLux.numberOfBoxes = 5;

        System.out.println("Info about autoLux object with Address " + autoLux.address +
                "with nr of Boxes " + autoLux.numberOfBoxes + " and dimension " + autoLux.dimensionSqFt);

        Tool hummer011 = new Tool("Hummer");
        System.out.println(hummer011.material);
        System.out.println(hummer011.nameOfTheTool);

        Tool key = new Tool("Lucky Key");
        System.out.println(key.nameOfTheTool);

        Worker ionelCelHarnic = new Worker("Ion");
        System.out.println(ionelCelHarnic.pricePerHour);
        ionelCelHarnic.yearsOfExperience = 5;
        System.out.println(ionelCelHarnic.yearsOfExperience);

        Worker marcelCelPuternic = new Worker();


        Car myCar = new Car("BMW", "Black", 3, 4500);
        System.out.println("My Car make is" + myCar.make + "with color" + myCar.colorOfTheCar + "it has" +
                myCar.numberOfDoor + "doors and the engine capacity is" + myCar.motorCapacity);


        Car alinaCar = new Car("Bugatti", "Yellow", 3, 5000);

        System.out.println(alinaCar.colorOfTheCar);


    }
}
