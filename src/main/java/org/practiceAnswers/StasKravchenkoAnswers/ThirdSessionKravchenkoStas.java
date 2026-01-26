package org.practiceAnswers.StasKravchenkoAnswers;

import org.practiceAnswers.StasKravchenkoAnswers.Classes.Person;
import org.practiceAnswers.StasKravchenkoAnswers.Classes.Example;
import org.practiceAnswers.StasKravchenkoAnswers.Classes.Child;
import org.practiceAnswers.StasKravchenkoAnswers.Classes.Counter;
import org.practiceAnswers.StasKravchenkoAnswers.Classes.Dog;
import org.practiceAnswers.StasKravchenkoAnswers.Classes.Bird;
import org.practiceAnswers.StasKravchenkoAnswers.Classes.ElectricCar;

public class ThirdSessionKravchenkoStas {

    public static void main(String[] args) {
        // =====================================================
        // 8. equals() И hashCode()
        // =====================================================

        // Задание 8.1 — Переопределение equals() и hashCode()
        /*
         * Создайте класс Person с полями name (String) и age (int)
         * Переопределите equals() и hashCode()
         * Создайте два объекта с одинаковыми значениями полей для класса Person
         * Убедитесь, что equals() и hashCode() возвращают true при сравнении объектов
         */

        Person p1 = new Person("Alex",25);
        Person p2 = new Person("Alex",25);

        System.out.println("P1 = P2 через equals? Ответ = "+p1.equals(p2));
        System.out.println("P1 = P2 через hashcode? Ответ = "+(p1.hashCode()== p2.hashCode()));

        // Задание 8.2 — Сравнение объектов
        /*
         * Создайте два объекта Integer с одинаковым значением
         * Сравните их через == и через equals()
         * Выведите результаты
         */

        Integer num1= new Integer(25);
        Integer num2= new Integer(25);

        System.out.println("num1 == num2? Ответ =" + (num1 == num2));
        System.out.println("num1 equals num2? Ответ =" + (num1.equals(num2)));

        // =====================================================
        // 9. МОДИФИКАТОРЫ ДОСТУПА
        // =====================================================

        // Задание 9.1 — Private и public
        /*
         * Создайте класс Example с полем private int x
         * Попробуйте обратиться к x из другого класса (должна быть ошибка, IDE так же не позволит этого сделать)
         * Создайте public метод getX(), чтобы получить значение x
         */

        Example example = new Example(20);

        System.out.println("х = "+ example.getX());

        // Задание 9.2 — Protected и наследование
        /*
         * Создайте класс Parent с protected полем value
         * Создайте класс Child extends Parent
         * Попробуйте обратиться к value из Child (доступ разрешён)
         */

        Child child = new Child(5);

        child.printValue();

        // =====================================================
        // 10. STATIC И FINAL
        // =====================================================

        // Задание 10.1 — Static поле и метод
        /*
         * Создайте класс Counter с static полем count и конструктором, который увеличивает count
         * Создайте несколько объектов Counter
         * Выведите Counter.count (должно быть количество созданных объектов)
         */

        Counter count1 = new Counter();
        Counter count2 = new Counter();
        Counter count3 = new Counter();

        count1.printValue();

        // Задание 10.2 — Final переменная
        /*
         * Создайте final переменную int MAX = 100
         * Попробуйте изменить её значение (должна быть ошибка компиляции)
         */
        final int MAX = 100;
        //MAX = 99;

        // Задание 10.3 — Final метод
        /*
         * Создайте класс Parent с final методом sayHello()
         * Создайте наследника Child и попробуйте переопределить sayHello() (должна быть ошибка)
         */

        // =====================================================
        // 11. АБСТРАКТНЫЙ КЛАСС И ИНТЕРФЕЙС
        // =====================================================

        // Задание 11.1 — Абстрактный класс
        /*
         * Создайте абстрактный класс Animal с абстрактным методом makeSound() и методом sleep()
         * Создайте класс Dog extends Animal и реализуйте makeSound()
         * Создайте объект Dog и вызовите makeSound() и sleep()
         */

        Dog dog = new Dog("Archie");

        dog.makeSound();
        dog.sleep();

        // Задание 11.2 — Интерфейс
        /*
         * Создайте интерфейс Flyable с методом fly()
         * Создайте класс Bird implements Flyable
         * Реализуйте метод fly() с выводом текста
         * Создайте объект Bird и вызовите fly()
         */

        Bird bird = new Bird();

        bird.fly();

        // Задание 11.3 — Абстрактный класс + интерфейс
        /*
         * Создайте абстрактный класс Vehicle с абстрактным методом move()
         * Создайте интерфейс Electric с методом charge()
         * Создайте класс ElectricCar extends Vehicle implements Electric
         * Реализуйте оба метода и вызовите их
         */

        ElectricCar electricCar = new ElectricCar();

        electricCar.move();
        electricCar.charge();
    }
}
