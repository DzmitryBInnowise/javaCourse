package org.practiceAnswers.AnnaVerkhovaAnswers.Classes.Animals;

public abstract class Animal {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " Animal makes sound ");
    }

    public abstract void makeSoundAbstract();

    public void sleep(){
        System.out.println(name + " sleeps sweetly");
    }
}
