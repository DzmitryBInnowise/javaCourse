package org.practiceAnswers.StanislawHolovnevAnswers.models.vechicle;


import org.practiceAnswers.StanislawHolovnevAnswers.models.interfaces.Electric;

public class ElectricCar extends Vehicle implements Electric {

    private String name;

    public ElectricCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void Charge() {
        System.out.println(name + ": " + "Charging....");
    }

    @Override
    public void move() {
        System.out.println(name + ": " + "Moving....");
    }
}
