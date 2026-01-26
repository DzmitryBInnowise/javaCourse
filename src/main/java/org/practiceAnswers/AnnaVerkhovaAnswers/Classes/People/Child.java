package org.practiceAnswers.AnnaVerkhovaAnswers.Classes.People;

public class Child extends Parent {

    public Child(int value) {
        super(value);
    }

    public void useValue() {
        System.out.println("Value from class Parent " + value);
    }
//    @Override
//    public final void sayHello() {
//        System.out.println("Hello! I'm Child!");
//    }
}
