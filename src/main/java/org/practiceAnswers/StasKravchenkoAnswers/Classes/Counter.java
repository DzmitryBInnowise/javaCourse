package org.practiceAnswers.StasKravchenkoAnswers.Classes;

public class Counter {
    static int count;

    public Counter(){
        count++;
    }

    public void printValue() {
        System.out.println("Значение переменной count: " + count);
    }
}
