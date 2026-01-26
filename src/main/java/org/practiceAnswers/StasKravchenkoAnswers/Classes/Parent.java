package org.practiceAnswers.StasKravchenkoAnswers.Classes;

public class Parent {
    protected int value;

    public Parent(int value) {
        this.value = value;
    }

    final void sayHello(){
        System.out.println("Hello for parent");
    }
}
