package org.practiceAnswers.StasKravchenkoAnswers.Classes;

public class Child extends Parent {
    public Child(int value) {
        super(value); // Вызываем конструктор Parent для инициализации value
    }

    public void printValue() {
        System.out.println("Значение из Child: " + value);
    }

    /* @Override void sayHello(){
        // Ошибка sayHello()' cannot override 'sayHello()' in
        // 'org.practiceAnswers.StasKravchenkoAnswers.Classes.Parent';
        // overridden method is final
    }*/

}
