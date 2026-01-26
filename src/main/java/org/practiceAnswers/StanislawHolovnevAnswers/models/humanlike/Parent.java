package org.practiceAnswers.StanislawHolovnevAnswers.models.humanlike;

public class Parent {
    protected int value;

    public Parent(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public final void sayHello() {
        System.out.println("Hello mate!");
    }
}
