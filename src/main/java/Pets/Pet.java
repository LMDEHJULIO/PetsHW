package Pets;

abstract class Pet {

    private String name;

    private char sex;

    private String speciesName;


    private boolean isAdult;

    private String color;

    private int age;

    public String getName(){
        return this.name;
    };

    public void setName(String name){
        this.name = name;
    };

    public Pet(String name){
        this.name = name;
    }
    abstract void speak();
}
