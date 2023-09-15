package Pets;
import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private List<Pet> pets;

    public void addPet(Pet newPet){
        pets.add(newPet); // used list to get add method for easier insertion.
    }

    public User(String name, Pet[] pets) {
        this.name = name;
        this.pets = new ArrayList<>();
    }
}
