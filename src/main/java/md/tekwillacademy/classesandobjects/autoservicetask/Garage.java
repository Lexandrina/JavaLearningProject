package md.tekwillacademy.classesandobjects.autoservicetask;

public class Garage {
    String address;
    int numberOfBoxes;
    double dimensionSqFt;

    public Garage(String addressUsedForInitialization, int numberOfBoxes, double dimensionSqFt){
        address = addressUsedForInitialization;
        this.numberOfBoxes = numberOfBoxes;
        this.dimensionSqFt = dimensionSqFt;

    }

    public Garage(){
        System.out.println("A fost create un obiect care insa nu are nici un parametru populat cu datre concrete. " +
                "Acesta e constructor definit fara parametri");
    }
    }
