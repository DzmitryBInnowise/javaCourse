package org.practiceAnswers.StanislawHolovnevAnswers.models.generics;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Box <T>{

    private T value;

    public Box(T value) {
        this.value = value;
    }
}
