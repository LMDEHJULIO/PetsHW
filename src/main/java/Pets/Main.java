package Pets;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    static void displayOptions(String[] options){
        for(String option : options){
            System.out.println(option);
        }
    }

    public static void main(String[] args) {
        Scanner petSurvey = new Scanner(System.in);

        boolean quit = false;

        String[] options = {"1. Dog", "2. Cat", "3. Rodent", "4. Lizard"};

        System.out.println("Welcome to PetSurvey. What's your name?");

        String name = petSurvey.nextLine();

        User currentUser = new User(name);

        System.out.println("Awesome name. So, how many pets do you have?");

        int petCount = petSurvey.nextInt();
        petSurvey.nextLine();

        System.out.println("Really? That's perfect if you ask me. What kind of pet are they?");

        for(int i = 0; i < petCount; i++){
            System.out.println("Pet #" + (i + 1) + ": type: ");

            displayOptions(options);

            int option = Integer.parseInt(petSurvey.nextLine());

            System.out.println("What's their name");

            String petName = petSurvey.nextLine();

            switch (option) {
                case 1 -> currentUser.addPet(new Dog(petName));
                case 2 -> currentUser.addPet(new Cat(petName));
                case 3 -> currentUser.addPet(new Rodent(petName));
                case 4 -> currentUser.addPet(new Lizard(petName));
                default -> System.out.println("We currently support Dogs, Cats, Rodents, and Lizards. Looks like we should expand our survey!");
            }

        }

        if(petCount > 1){
            System.out.println("You've got a gift. Those are some cool names. Would you look at that, they're all right here. Hi pets!");
        } else {
            System.out.println("What a cool name! Oh look, they're right here. Hi, buddy!");
        }

        currentUser.printPets();
    }


}
