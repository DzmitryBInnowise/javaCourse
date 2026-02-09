package org.practiceAnswers.AlisaPauliuchenkavaAnswers.tasks;

import org.practiceAnswers.AlisaPauliuchenkavaAnswers.animal.Bird;
import org.practiceAnswers.AlisaPauliuchenkavaAnswers.animal.Dog;
import org.practiceAnswers.AlisaPauliuchenkavaAnswers.counter.Counter;
import org.practiceAnswers.AlisaPauliuchenkavaAnswers.example.Example;
import org.practiceAnswers.AlisaPauliuchenkavaAnswers.interfaces.Flyable;
import org.practiceAnswers.AlisaPauliuchenkavaAnswers.person.Child;
import org.practiceAnswers.AlisaPauliuchenkavaAnswers.person.Parent;
import org.practiceAnswers.AlisaPauliuchenkavaAnswers.person.Person;
import org.practiceAnswers.AlisaPauliuchenkavaAnswers.vehicle.ElectricCar;

import java.util.Objects;

public class ThirdSessionAlisaPauliuchenkava {

    public static void main(String[] args) {
        checkTrue("Alex", 23);
        checkInteger(140, 140);
        checkAccess(55);
        checkProtectedAccess();
        checkCounter();
        testFinal();
        checkFinalMethod();
        testAnimal("Ruby");
        testFlyable();
        checkElectricCar();
    }

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

    public static void checkTrue(String name, int age) {
        Person person1 = new Person(name, age);
        Person person2 = new Person(name, age);
        if (person1.equals(person2)) {
            System.out.println("результат equals - true");
        } else {
            System.out.println("результат equals - false");
        }
        if (person1.hashCode() == person2.hashCode()) {
            System.out.println("результат hashCode - true");
        } else {
            System.out.println("результат hashCode - false");
        }
    }

    // Задание 8.2 — Сравнение объектов
    /*
     * Создайте два объекта Integer с одинаковым значением
     * Сравните их через == и через equals()
     * Выведите результаты
     */

    public static boolean checkInteger(Integer num1, Integer num2) {
        System.out.println();
        boolean a = (num1 == num2);
        boolean b = Objects.equals(num1, num2);
        System.out.println("результат num1 == num2: " + a);
        System.out.println("результат num1.equals(num2): " + b);
        return b;
    }

    // =====================================================
    // 9. МОДИФИКАТОРЫ ДОСТУПА
    // =====================================================

    // Задание 9.1 — Private и public
    /*
     * Создайте класс Example с полем private int x
     * Попробуйте обратиться к x из другого класса (должна быть ошибка, IDE так же не позволит этого сделать)
     * Создайте public метод getX(), чтобы получить значение x
     */

    public static void checkAccess(int x) {
        System.out.println();
        Example example = new Example(x);
        int value = example.getX();
        System.out.println("значение x через getX(): " + value);
    }

    // Задание 9.2 — Protected и наследование
    /*
     * Создайте класс Parent с protected полем value
     * Создайте класс Child extends Parent
     * Попробуйте обратиться к value из Child (доступ разрешён)
     */

    public static void checkProtectedAccess() {
        System.out.println();
        Child child = new Child();
        child.printValue();
    }

    // =====================================================
    // 10. STATIC И FINAL
    // =====================================================

    // Задание 10.1 — Static поле и метод
    /*
     * Создайте класс Counter с static полем count и конструктором, который увеличивает count
     * Создайте несколько объектов Counter
     * Выведите Counter.count (должно быть количество созданных объектов)
     */

    public static void checkCounter() {
        System.out.println();
        new Counter();
        new Counter();
        new Counter();
        System.out.println("количество через поле: " + Counter.count);
        System.out.println("количество через метод getCount(): " + Counter.getCount());
        System.out.println("итого: " + Counter.count);
    }

    // Задание 10.2 — Final переменная
    /*
     * Создайте final переменную int MAX = 100
     * Попробуйте изменить её значение (должна быть ошибка компиляции)
     */

    public static void testFinal() {
        System.out.println();
        final int MAX = 100;
        //MAX = 10;
        System.out.println("MAX: " + MAX);
    }

    // Задание 10.3 — Final метод
    /*
     * Создайте класс Parent с final методом sayHello()
     * Создайте наследника Child и попробуйте переопределить sayHello() (должна быть ошибка)
     */

    public static void checkFinalMethod() {
        System.out.println();
        Parent person = new Child();
        person.sayHello();
    }

    // =====================================================
    // 11. АБСТРАКТНЫЙ КЛАСС И ИНТЕРФЕЙС
    // =====================================================

    // Задание 11.1 — Абстрактный класс
    /*
     * Создайте абстрактный класс Animal с абстрактным методом makeSound() и методом sleep()
     * Создайте класс Dog extends Animal и реализуйте makeSound()
     * Создайте объект Dog и вызовите makeSound() и sleep()
     */

    public static void testAnimal(String name) {
        System.out.println();
        Dog myDog = new Dog(name);
        myDog.makeSound();
        myDog.sleep();
    }

    // Задание 11.2 — Интерфейс
    /*
     * Создайте интерфейс Flyable с методом fly()
     * Создайте класс Bird implements Flyable
     * Реализуйте метод fly() с выводом текста
     * Создайте объект Bird и вызовите fly()
     */

    public static void testFlyable() {
        System.out.println();
        Bird myBird = new Bird();
        myBird.fly();
        Flyable flyable = new Bird();
        flyable.fly();
    }

    // Задание 11.3 — Абстрактный класс + интерфейс
    /*
     * Создайте абстрактный класс Vehicle с абстрактным методом move()
     * Создайте интерфейс Electric с методом charge()
     * Создайте класс ElectricCar extends Vehicle implements Electric
     * Реализуйте оба метода и вызовите их
     */

    public static void checkElectricCar() {
        System.out.println();
        ElectricCar car = new ElectricCar();
        car.move();
        car.charge();
    }
}
