package org.practiceAnswers.AnnaVerkhovaAnswers.SecondSession;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println(name + " Animal makes sound ");
    }
}
