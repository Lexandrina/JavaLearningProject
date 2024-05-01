package md.tekwillacademy.zooclubservice;

public class Chicken extends Animal{
    public Chicken(String name) {
        super(name);
    };

    @Override
    public void eat() {
        System.out.println( "The chicken eats grains and seeds!");
    }

    @Override
    public void makeSound() {
        System.out.println("The chicken is chirping Co! co! CO!");
    }
}
