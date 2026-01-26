package org.practiceAnswers.StanislawHolovnevAnswers.models.animal;

import org.practiceAnswers.StanislawHolovnevAnswers.models.interfaces.Flyable;

public class Bird implements Flyable {

    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.println(name + ": " + "Im the bird n im flyyyingggg!");
    }
}
