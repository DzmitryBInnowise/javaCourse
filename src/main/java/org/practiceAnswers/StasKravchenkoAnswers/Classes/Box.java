package org.practiceAnswers.StasKravchenkoAnswers.Classes;

public class Box<T> {
    T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public <T> void print(T value) {

    }
}
