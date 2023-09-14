package Pets;

public class Lizard extends Pet {
    public Lizard(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println("*Flicks tongue*, my name is " + this.getName() + ". I am a lizard.");
    }
}
