package org.practiceAnswers.AnnaVerkhovaAnswers.Tasks;


import org.practiceAnswers.AnnaVerkhovaAnswers.Classes.Animals.Bird;
import org.practiceAnswers.AnnaVerkhovaAnswers.Classes.Animals.Dog;
import org.practiceAnswers.AnnaVerkhovaAnswers.Classes.Different.Counter;
import org.practiceAnswers.AnnaVerkhovaAnswers.Classes.Different.Example;
import org.practiceAnswers.AnnaVerkhovaAnswers.Classes.People.Child;
import org.practiceAnswers.AnnaVerkhovaAnswers.Classes.People.Parent;
import org.practiceAnswers.AnnaVerkhovaAnswers.Classes.People.Person;
import org.practiceAnswers.AnnaVerkhovaAnswers.Classes.Vehicle.ElectricCar;

public class ThirdSessionAnnaVerkhova {

    public static void main(String[] args) {
        equalsPerson("Anna", 30);
        createInteger(300);
        getX(10);
        useValueFromParent(16);
        useCount();
        useFinalMax(100);
        useSayHello(1);
        createDogObject("Amigo","Woff");
        createBird("Sparrow");
        useElectricCar("BYD");
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

    public static boolean equalsPerson(String name, int age) {
        Person personOne = new Person(name, age);
        Person personTwo = new Person(name, age);
        System.out.println("personOne hashCode = " + personOne.hashCode());
        System.out.println("personTwo hashCode = " + personTwo.hashCode());
        System.out.println("personOne and personTwo = " + personOne.equals(personTwo));
        return personOne.equals(personTwo) && (personOne.hashCode() == personTwo.hashCode());
    }

    // Задание 8.2 — Сравнение объектов
    /*
     * Создайте два объекта Integer с одинаковым значением
     * Сравните их через == и через equals()
     * Выведите результаты
     */

    public static void createInteger(int value) {
        Integer integerOne = value;
        Integer integerTwo = value;
        System.out.println("Integer compare with == " + (integerOne == integerTwo));   // false
        System.out.println("Integer compare with equals() " + integerOne.equals(integerTwo));   //true
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

    public static void getX(int val){
        Example example = new Example(10);
        int value = example.getX();
        System.out.println("Value of X = " + value);
    }

    // Задание 9.2 — Protected и наследование
    /*
     * Создайте класс Parent с protected полем value
     * Создайте класс Child extends Parent
     * Попробуйте обратиться к value из Child (доступ разрешён)
     */

    public static void useValueFromParent(int value){
        Child child = new Child(value);
        child.useValue();
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

    public static void useCount(){
        Counter counter = new Counter();
        Counter counter1 = new Counter();
        System.out.println("Counter is " +Counter.getCount());
    }

    // Задание 10.2 — Final переменная
    /*
     * Создайте final переменную int MAX = 100
     * Попробуйте изменить её значение (должна быть ошибка компиляции)
     */

    public static  void useFinalMax(int value){
        final int max = value;
       // max = 200;  max не изменится тк переменную final нельзя изменить
        System.out.println("Max = " + max);
    }

    // Задание 10.3 — Final метод
    /*
     * Создайте класс Parent с final методом sayHello()
     * Создайте наследника Child и попробуйте переопределить sayHello() (должна быть ошибка)
     */

    public static void useSayHello(int value){
        Parent parent = new Parent(value);
        System.out.println("Say from class Parent ");
        parent.sayHello();
        Child child = new Child(value);
        child.sayHello();  // переопределить метод final sayHello() нельзя в классе Child
        System.out.println("sayHello() in Child cannot override sayHello() in Parent overridden method is final");
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

    public static void createDogObject(String name, String voice) {
        Dog dog = new Dog(name, voice);
        dog.makeSoundAbstract();
        dog.makeSound();
        dog.sleep();
    }

    // Задание 11.2 — Интерфейс
    /*
     * Создайте интерфейс Flyable с методом fly()
     * Создайте класс Bird implements Flyable
     * Реализуйте метод fly() с выводом текста
     * Создайте объект Bird и вызовите fly()
     */

    public static void createBird(String name){
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

    public static void useElectricCar(String name){
        ElectricCar electricCar = new ElectricCar(name);
        electricCar.charge();
        electricCar.move();
    }
}