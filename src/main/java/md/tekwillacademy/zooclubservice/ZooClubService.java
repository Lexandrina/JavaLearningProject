package md.tekwillacademy.zooclubservice;

public class ZooClubService {
    public static void main(String[] args) {
        Dog bimDog = new Dog("Bim");
        Animal lucyCat = new Cat("LucyMiaw");
        Animal mouseMickey = new Mouse("Mickey mouse");
        Animal chickenCiki = new Chicken("Ciki");

        lucyCat.eat();
        lucyCat.makeSound();


        bimDog.eat();
        bimDog.makeSound();

        mouseMickey.eat();
        mouseMickey.makeSound();

        chickenCiki.eat();
        chickenCiki.makeSound();
    }
}
