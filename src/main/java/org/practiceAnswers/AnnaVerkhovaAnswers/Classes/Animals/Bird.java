package org.practiceAnswers.AnnaVerkhovaAnswers.Classes.Animals;

import org.practiceAnswers.AnnaVerkhovaAnswers.Interfases.Flyable;

public class Bird implements Flyable {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fly(){
        System.out.println( name + " say - I love fly");
    }
}
