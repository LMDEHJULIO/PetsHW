package Pets;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PetSurvey {
    Scanner petSurvey = new Scanner(System.in);

    String[] options = {"1. Dog", "2. Cat", "3. Rodent", "4. Lizard", "5. Fish"};

    static void displayOptions(String[] options){
        for(String option : options){ System.out.println(option); }
    }

    private String askForName(){
        System.out.println("Welcome to PetSurvey. What's your name?");

        return petSurvey.nextLine();
    }

    private int askForPetCount(String name){
        System.out.println("Awesome name. So, how many pets do you have, " + name+ "?");

        try {
            int count = petSurvey.nextInt();

            petSurvey.nextLine();

            return count;
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid option.");

            petSurvey.nextLine();
        }


        return 0;
    }

    private void exitStatement(int petCount) {

        String statement = petCount > 1 ?
        "You've got a gift. Those are some cool names. Would you look at that, they're all right here. Hi pets!"
        :
        "What a cool name! Oh look, they're right here. Hi, buddy!";

        System.out.println(statement);

    }
    private void selectPet(User currentUser, int i){
        System.out.println("Pet #" + (i + 1) + ": type: ");

        displayOptions(options);


        int option;

        while(true) {
            try {
                option = Integer.parseInt(petSurvey.nextLine());

                if(option < 1 || option > options.length){
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please Select a Valid Option");
            }
        }

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

        int petCount = askForPetCount(name);

        for(int i = 0; i < petCount; i++){
            selectPet(currentUser, i);
        }

        exitStatement(petCount);

        currentUser.printPets();
    }

}
