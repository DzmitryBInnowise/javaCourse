package org.practiceAnswers.StanislawHolovnevAnswers.models.animal;

import lombok.Getter;
import lombok.Setter;
import org.practiceAnswers.StanislawHolovnevAnswers.models.interfaces.Flyable;

@Getter
@Setter
public class Bird implements Flyable {

    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.println(name + ": " + "Im the bird n im flyyyingggg!");
    }
}
