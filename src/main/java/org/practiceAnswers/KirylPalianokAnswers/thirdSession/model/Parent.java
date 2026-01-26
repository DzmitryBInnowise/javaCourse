package org.practiceAnswers.KirylPalianokAnswers.thirdSession.model;

public class Parent {

	// Задание 10.3 — Final метод
	/*
	 * Создайте класс Parent с final методом sayHello()
	 * Создайте наследника Child и попробуйте переопределить sayHello() (должна быть ошибка)
	 */

	protected int value;

	public Parent(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	final void sayHello() {
		System.out.println("Hello!");
	}
}
