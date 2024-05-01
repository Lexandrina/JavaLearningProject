package md.tekwillacademy.zooclubservice;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(getName() + ":  The cat is saying like: MEAW, meaw, Meaw");
    }


    @Override
    public void eat() {
        System.out.println(getName() + ":  The cat is eating fish food!");
    }
}
