package org.practiceAnswers.StanislawHolovnevAnswers.models.humanlike;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Parent {
    protected int value;

    public Parent(int value) {
        this.value = value;
    }


    public final void sayHello() {
        System.out.println("Hello mate!");
    }
}
