package org.practiceAnswers.StanislawHolovnevAnswers.models.values;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Calculator<T extends Number> {


    public double doubleValue(T value) {
        return value.doubleValue();
    }



}
