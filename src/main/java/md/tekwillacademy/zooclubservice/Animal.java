package md.tekwillacademy.zooclubservice;

public abstract class Animal implements AnimalInterface {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Abstract class
    public abstract void eat();
}
