package org.practiceAnswers.StanislawHolovnevAnswers.models.animal;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": " + "Yo, woof woof!");
    }
}
