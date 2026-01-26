package org.practiceAnswers.KirylPalianokAnswers.thirdSession;

import org.practiceAnswers.KirylPalianokAnswers.secondSession.model.Person;
import org.practiceAnswers.KirylPalianokAnswers.thirdSession.model.animal.Bird;
import org.practiceAnswers.KirylPalianokAnswers.thirdSession.model.human.Child;
import org.practiceAnswers.KirylPalianokAnswers.thirdSession.model.util.Counter;
import org.practiceAnswers.KirylPalianokAnswers.thirdSession.model.animal.Dog;
import org.practiceAnswers.KirylPalianokAnswers.thirdSession.model.vehicle.ElectricCar;
import org.practiceAnswers.KirylPalianokAnswers.thirdSession.model.example.Example;

public class ThirdSessionKirylPalianok {

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

		Person p1 = new Person("Alex", 25);
		Person p2 = new Person("Alex", 25);

		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode() == p2.hashCode());

		// Задание 8.2 — Сравнение объектов
		/*
		 * Создайте два объекта Integer с одинаковым значением
		 * Сравните их через == и через equals()
		 * Выведите результаты
		 */

		Integer int1 = new Integer(100);
		Integer int2 = new Integer(100);

		System.out.println(int1 == int2);
		System.out.println(int1.equals(int2));

        // =====================================================
		// 9. МОДИФИКАТОРЫ ДОСТУПА
		// =====================================================

		// Задание 9.1 — Private и public
		/*
		 * Создайте класс Example с полем private int x
		 * Попробуйте обратиться к x из другого класса (должна быть ошибка, IDE так же не позволит этого сделать)
		 * Создайте public метод getX(), чтобы получить значение x
		 */

		Example example = new Example();
		example.setX(12);
		example.getX();

		// Задание 9.2 — Protected и наследование
		/*
		 * Создайте класс Parent с protected полем value
		 * Создайте класс Child extends Parent
		 * Попробуйте обратиться к value из Child (доступ разрешён)
		 */

		Child child = new Child(13);
		child.showValue();

		// =====================================================
		// 10. STATIC И FINAL
		// =====================================================

		// Задание 10.1 — Static поле и метод
		/*
		 * Создайте класс Counter с static полем count и конструктором, который увеличивает count
		 * Создайте несколько объектов Counter
		 * Выведите Counter.count (должно быть количество созданных объектов)
		 */

		Counter counter1 = new Counter();
		Counter counter2 = new Counter();
		Counter counter3 = new Counter();

		System.out.println(Counter.getCount());

		// =====================================================
		// 11. АБСТРАКТНЫЙ КЛАСС И ИНТЕРФЕЙС
		// =====================================================

		// Задание 11.1 — Абстрактный класс
		/*
		 * Создайте абстрактный класс Animal с абстрактным методом makeSound() и методом sleep()
		 * Создайте класс Dog extends Animal и реализуйте makeSound()
		 * Создайте объект Dog и вызовите makeSound() и sleep()
		 */

		Dog dog = new Dog();
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
		electricCar.charge();
		electricCar.move();

	}
}
