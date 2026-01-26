package org.practiceAnswers.KirylPalianokAnswers.secondSession.model;

import java.util.Objects;

public class Person {

	// ЗАДАНИЕ 3.1
	// Создай класс Person (ниже):
	// - имя
	// - возраст
	// - метод printInfo()
	// Создай объект и вызови метод

	// Задание 8.1 — Переопределение equals() и hashCode()
	/*
	 * Создайте класс Person с полями name (String) и age (int)
	 * Переопределите equals() и hashCode()
	 * Создайте два объекта с одинаковыми значениями полей для класса Person
	 * Убедитесь, что equals() и hashCode() возвращают true при сравнении объектов
	 */

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Person person = (Person) obj;
		return age == person.age &&
				Objects.equals(name, person.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
}
