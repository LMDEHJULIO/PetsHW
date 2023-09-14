package Pets;

public class Dog extends Pet{
    public Dog(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println("Woof, my name is " + this.getName() + ". I am a dog.");
    }
}
