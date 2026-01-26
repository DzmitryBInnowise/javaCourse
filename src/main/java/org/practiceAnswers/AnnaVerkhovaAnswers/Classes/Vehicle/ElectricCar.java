package org.practiceAnswers.AnnaVerkhovaAnswers.Classes.Vehicle;

import org.practiceAnswers.AnnaVerkhovaAnswers.Interfases.Electric;

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
    public void charge(){
        System.out.println( name + " I need a charge");
    }


    @Override
    public void move() {
        System.out.println(name + " move on the road");
    }
}
