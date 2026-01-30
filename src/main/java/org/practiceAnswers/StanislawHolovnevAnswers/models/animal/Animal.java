package org.practiceAnswers.StanislawHolovnevAnswers.models.animal;

import lombok.Getter;
import lombok.Setter;

// class Animal { }
@Getter
@Setter
public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + ": " + "RRRR?!");
    }

    public abstract void makeSoundAbstract();

    public void sleep() {
        System.out.println(name + ": " + "Just sleeping...");
    }
}
