package org.practiceAnswers.StasKravchenkoAnswers.Classes;

public class CalculatorGeneric<T extends Number> {
    private T value;

    public CalculatorGeneric(T value) {
        this.value = value;
    }

    public double doubleValue() {
        return value.doubleValue();
    }
}
