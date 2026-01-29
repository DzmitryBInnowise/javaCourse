package org.practiceAnswers.AnnaVerkhovaAnswers.Classes.Different;

public class Box<T> {
    T value;

    public Box(T value) {
        this.value = value;
    }

    public Box() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
