package org.practiceAnswers.StasKravchenkoAnswers.Classes;

import org.practiceAnswers.StasKravchenkoAnswers.Interfaces.Electric;

public class ElectricCar extends Vehicle implements Electric {
    @Override
    public void move() {
        System.out.println("Electric car moves");
    }

    @Override
    public void charge() {
        System.out.println("Car is charging");
    }
}
