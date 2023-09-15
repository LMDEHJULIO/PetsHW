package Pets;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(
                "Mittens"
        );

        cat1.speak();

        Dog dog1 = new Dog(
                "Barkley"
        );

        dog1.speak();

        Lizard liz1 = new Lizard(
                "Slizzy"
        );

        liz1.speak();

        Fish fish1 = new Fish(
                "Bubbles"
        );

        fish1.speak();



        User user1 = new User("Julio");

        user1.addPet(dog1);
        user1.addPet(liz1);


        user1.printPets();
    }
}
