package Pets;

import java.util.Arrays;
import java.util.Scanner;


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

        Scanner petSurvey = new Scanner(System.in);

        boolean quit = false;
        System.out.println("Welcome to PetSurvey. What's your name?");

        String name = petSurvey.nextLine();

        User currentUser = new User(name);

        System.out.println("Awesome name. So, how many pets do you have?");

        int petCount = petSurvey.nextInt();


        System.out.println("Really? That's perfect if you ask me. What kind of pet are they?");

        System.out.println("So cool! What are their names in the order you listed?");

        System.out.println("You've got a gift. Those are some cool names. So, if I have that right. These are your pets and their names: ");


    }
}
