package Pets;

public class Fish extends Pet{
    public Fish(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println("Bloop-bloop, my name is " + this.getName() + ". I am a fish.");
    }
}
