package Pets;

public class Rodent extends Pet{
    public Rodent(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println("*Squeak*, my name is " + this.getName() + ". I am a rodent");
    }
}
