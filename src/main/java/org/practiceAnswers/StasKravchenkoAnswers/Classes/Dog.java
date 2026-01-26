package org.practiceAnswers.StasKravchenkoAnswers.Classes;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog " + getName() + " barks");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
