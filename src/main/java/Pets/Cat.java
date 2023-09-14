package Pets;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println("Meow, my name is " + this.getName() + ". I am a cat");
    }
}
