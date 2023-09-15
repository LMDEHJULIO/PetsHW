package Pets;
import java.util.Scanner;
public class PetSurvey {
    Scanner petSurvey = new Scanner(System.in);

    String[] options = {"1. Dog", "2. Cat", "3. Rodent", "4. Lizard", "5. Fish"};

    static void displayOptions(String[] options){
        for(String option : options){
            System.out.println(option);
        }
    }

    private String askForName(){
        System.out.println("Welcome to PetSurvey. What's your name?");

        return petSurvey.nextLine();
    }

    private int askForPetCount(){
        System.out.println("Awesome name. So, how many pets do you have?");

        int count = petSurvey.nextInt();

        petSurvey.nextLine();

        return count;
    }

    private void exitStatement(int petCount){
        if(petCount > 1){
            System.out.println("You've got a gift. Those are some cool names. Would you look at that, they're all right here. Hi pets!");
        } else {
            System.out.println("What a cool name! Oh look, they're right here. Hi, buddy!");
        }
    }
    private void selectPet(User currentUser, int i){
        System.out.println("Pet #" + (i + 1) + ": type: ");

        int option = Integer.parseInt(petSurvey.nextLine());

        System.out.println("What's their name");

        String petName = petSurvey.nextLine();

        switch (option) {
            case 1 -> currentUser.addPet(new Dog(petName));
            case 2 -> currentUser.addPet(new Cat(petName));
            case 3 -> currentUser.addPet(new Rodent(petName));
            case 4 -> currentUser.addPet(new Lizard(petName));
            case 5 -> currentUser.addPet(new Fish(petName));
            default -> System.out.println("We currently support Dogs, Cats, Rodents, and Lizards. Looks like we should expand our survey!");
        }
    }



    public void startSurvey() {

        String name = askForName();

        User currentUser = new User(name);

        int petCount = askForPetCount();

        for(int i = 0; i < petCount; i++){
            selectPet(currentUser, i);
        }

        exitStatement(petCount);
//        System.out.println("Welcome to PetSurvey. What's your name?");
//
//        String name = petSurvey.nextLine();
//
//        User currentUser = new User(name);
//
//        System.out.println("Awesome name. So, how many pets do you have?");
//
//        int petCount = petSurvey.nextInt();
//        petSurvey.nextLine();
//
//        System.out.println("Really? That's perfect if you ask me. What kind of pet are they?");
//
//        for(int i = 0; i < petCount; i++){
//            System.out.println("Pet #" + (i + 1) + ": type: ");
//
//            displayOptions(options);
//
//            int option = Integer.parseInt(petSurvey.nextLine());
//
//            System.out.println("What's their name");
//
//            String petName = petSurvey.nextLine();
//
//            switch (option) {
//                case 1 -> currentUser.addPet(new Dog(petName));
//                case 2 -> currentUser.addPet(new Cat(petName));
//                case 3 -> currentUser.addPet(new Rodent(petName));
//                case 4 -> currentUser.addPet(new Lizard(petName));
//                case 5 -> currentUser.addPet(new Fish(petName));
//                default -> System.out.println("We currently support Dogs, Cats, Rodents, and Lizards. Looks like we should expand our survey!");
//            }
//
//        }
//
//        if(petCount > 1){
//            System.out.println("You've got a gift. Those are some cool names. Would you look at that, they're all right here. Hi pets!");
//        } else {
//            System.out.println("What a cool name! Oh look, they're right here. Hi, buddy!");
//        }

        currentUser.printPets();
    }

}
