package org.practiceAnswers.StasKravchenkoAnswers.Classes;

import org.practiceAnswers.StasKravchenkoAnswers.Interfaces.Flyable;

public class Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("Bird fly");
    }
}
