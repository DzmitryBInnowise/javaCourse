package org.practiceAnswers.AnnaVerkhovaAnswers.Classes.Different;

public class Calculator <T extends Number> {
    T value;

    public Calculator(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    public double doubleValue(){
        return value.doubleValue();
    }
}
