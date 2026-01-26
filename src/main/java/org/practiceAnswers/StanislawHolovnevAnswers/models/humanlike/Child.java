package org.practiceAnswers.StanislawHolovnevAnswers.models.humanlike;

public class Child extends Parent {

    public Child(int value) {
        super(value);
    }

    public void displayValue() {
        System.out.println("Value from Parent class:" + value);
    }

    // Попытка переопределить final метод вызовет ошибку компиляции
//    @Override
//    public void sayHello() {
//        System.out.println("Hello from Child class!");
//    }

}
