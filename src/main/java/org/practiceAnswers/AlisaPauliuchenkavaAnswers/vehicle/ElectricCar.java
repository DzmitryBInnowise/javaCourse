package org.practiceAnswers.AlisaPauliuchenkavaAnswers.vehicle;

import org.practiceAnswers.AlisaPauliuchenkavaAnswers.interfaces.Electric;

public class ElectricCar extends Vehicle implements Electric {
    @Override
    public void move() {
        System.out.println("машина едет");
    }

    @Override
    public void charge() {
        System.out.println("машина заряжается");
    }
}
