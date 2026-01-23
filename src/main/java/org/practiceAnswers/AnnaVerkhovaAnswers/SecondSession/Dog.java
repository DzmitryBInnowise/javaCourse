package org.practiceAnswers.AnnaVerkhovaAnswers.SecondSession;

class Dog extends Animal {
    private String voice;

    Dog(String name, String voice) {
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
    void makeSound() {
        System.out.println("Dog " + getName() + " Say " + voice);
    }
}