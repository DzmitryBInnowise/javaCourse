package org.practiceAnswers.KirylPalianokAnswers.secondSession.model;

public class Animal {

	// ЗАДАНИЕ 4.1
	// Создай класс Animal:
	// - name
	// - метод makeSound()

	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal() {}

	public void makeSound() {

		System.out.println("Roar");
	}
}
