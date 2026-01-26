package org.practiceAnswers.AnnaVerkhovaAnswers.Classes.Animals;

public class Dog extends Animal {
    private String voice;

    public Dog(String name, String voice) {
        super(name);
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog " + getName() + " Say " + voice);
    }
    @Override
    public void makeSoundAbstract(){
        System.out.println("Dog " + getName() + " rrrrr ");
    }
}