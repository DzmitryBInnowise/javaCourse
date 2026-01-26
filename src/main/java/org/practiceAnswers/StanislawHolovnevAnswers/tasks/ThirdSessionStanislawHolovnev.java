package org.practiceAnswers.StanislawHolovnevAnswers.tasks;


import org.practiceAnswers.StanislawHolovnevAnswers.models.*;
import org.practiceAnswers.StanislawHolovnevAnswers.models.animal.Bird;
import org.practiceAnswers.StanislawHolovnevAnswers.models.animal.Dog;
import org.practiceAnswers.StanislawHolovnevAnswers.models.humanlike.Child;
import org.practiceAnswers.StanislawHolovnevAnswers.models.humanlike.Parent;
import org.practiceAnswers.StanislawHolovnevAnswers.models.humanlike.Person;
import org.practiceAnswers.StanislawHolovnevAnswers.models.values.Counter;
import org.practiceAnswers.StanislawHolovnevAnswers.models.vechicle.ElectricCar;
import org.practiceAnswers.StanislawHolovnevAnswers.models.vechicle.Example;

public class ThirdSessionStanislawHolovnev {

    public static void main(String[] args) {
        usePersonClass("Alice", 30);
        useIntegerObjects(100);
        useExampleClassToModifies(22);
        useChildClass(12);
        useCounterClass();
        tryToOverride(12);
        useAbstractClassAnimal("Reggy", "Woooof");
        useFlyable("Milty");
        useElectricCar("Tesla S");
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

    public static boolean usePersonClass(String name, int age) {
        Person personOne = new Person(name, age);
        Person personTwo = new Person(name, age);
        System.out.println("personOne equals personTwo: " + personOne.equals(personTwo));
        System.out.println("personOne hashCode: " + personOne.hashCode());
        System.out.println("personTwo hashCode: " + personTwo.hashCode());
        return personOne.equals(personTwo) && (personOne.hashCode() == personTwo.hashCode());
    }

    // Задание 8.2 — Сравнение объектов
    /*
     * Создайте два объекта Integer с одинаковым значением
     * Сравните их через == и через equals()
     * Выведите результаты
     */

    public static void useIntegerObjects(int value) {
        Integer intOne = value;
        Integer integerTwo = value;
        System.out.println("Integer value with ==: " + (intOne == integerTwo));
        System.out.println("Integer value with equals(): " + intOne.equals(integerTwo));
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

    public static void useExampleClassToModifies(int newValue) {
        Example example = new Example(22);
        int value = example.getX();
        System.out.println("Value of x from Example is: " + value);
        int valueToSet = newValue;
        example.setX(valueToSet);
        System.out.println("New value of x from Example is: " + example.getX());
    }

    // Задание 9.2 — Protected и наследование
    /*
     * Создайте класс Parent с protected полем value
     * Создайте класс Child extends Parent
     * Попробуйте обратиться к value из Child (доступ разрешён)
     */

    public static void useChildClass(int value) {
        Child child = new Child(value);
        child.displayValue();
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

    public static void useCounterClass() {
        Counter counterOne = new Counter();
        Counter counterTwo = new Counter();
        Counter counterThree = new Counter();
        System.out.println("Number of created Counter objects is: " + Counter.getCount());
    }

    // Задание 10.2 — Final переменная
    /*
     * Создайте final переменную int MAX = 100
     * Попробуйте изменить её значение (должна быть ошибка компиляции)
     */

    public static void tryToChangeFinalVariable(int value) {
        final int MAX = value;
        // MAX = 200;
        // Вызывает ошибку компиляции, т.к. final переменная является константой и не может быть изменена!
    }

    // Задание 10.3 — Final метод
    /*
     * Создайте класс Parent с final методом sayHello()
     * Создайте наследника Child и попробуйте переопределить sayHello() (должна быть ошибка)
     */

    public static void tryToOverride(int value) {
        Parent parent = new Parent(value);
        parent.sayHello();
        Child child = new Child(value);
        child.sayHello();
        System.out.println("Попытка переопределить final метод sayHello() в классе Child вызовет ошибку компиляции");
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

    public static void useAbstractClassAnimal(String name, String voice) {
        Dog dog = new Dog(name) {
            @Override
            public void makeSoundAbstract() {
                System.out.println(name + ": " + voice);
            }
        };
        dog.makeSoundAbstract();
        dog.sleep();
    }

    // Задание 11.2 — Интерфейс
    /*
     * Создайте интерфейс Flyable с методом fly()
     * Создайте класс Bird implements Flyable
     * Реализуйте метод fly() с выводом текста
     * Создайте объект Bird и вызовите fly()
     */

    public static void useFlyable(String name) {
        Bird bird = new Bird(name);
        bird.fly();
    }

    // Задание 11.3 — Абстрактный класс + интерфейс
    /*
     * Создайте абстрактный класс Vehicle с абстрактным методом move()
     * Создайте интерфейс Electric с методом charge()
     * Создайте класс ElectricCar extends Vehicle implements Electric
     * Реализуйте оба метода и вызовите их
     */

    public static void useElectricCar(String name) {
        ElectricCar electricCar = new ElectricCar(name);
        electricCar.Charge();
        electricCar.move();
    }
}