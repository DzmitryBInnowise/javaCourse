package org.practiceAnswers.AlisaPauliuchenkavaAnswers.animal;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": " + "grrr");
    }

    @Override
    public void makeSoundNew() {
        System.out.println("гав");
    }
}
