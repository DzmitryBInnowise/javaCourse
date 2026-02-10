package org.practiceAnswers.AlisaPauliuchenkavaAnswers.animal;

public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + ": " + "*sound*");
    }
    public abstract void makeSoundNew();

    public void sleep() {
        System.out.println("zzz");
    }
}
