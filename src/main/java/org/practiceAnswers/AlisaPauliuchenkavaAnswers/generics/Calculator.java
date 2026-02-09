package org.practiceAnswers.AlisaPauliuchenkavaAnswers.generics;

public class Calculator<T extends Number> {
    private T value;

    public Calculator(T value) {
        this.value = value;
    }

    public double getDoubleValue() {
        return value.doubleValue();
    }
}
