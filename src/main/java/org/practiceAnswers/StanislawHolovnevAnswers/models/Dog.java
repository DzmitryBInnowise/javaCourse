package org.practiceAnswers.StanislawHolovnevAnswers.models;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": " + "Yo, woof woof!");
    }
}
