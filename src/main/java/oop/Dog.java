package oop;

public class Dog extends Animal{

    private String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    public void fetch() {
        System.out.println(dogName + " is fetching the ball");
    }

    @Override
    public void sound() {
        System.out.println("Woof Woof");
    }
}
