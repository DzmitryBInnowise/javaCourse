package org.practiceAnswers.KirylPalianokAnswers.secondSession.model;

public class Dog extends Animal {

	// ЗАДАНИЕ 4.2
	// Создай класс Dog, который наследуется от Animal
	// Переопредели метод makeSound()
	// Создай объект Dog и вызови метод

	public Dog(String name) {
		super(name);
	}

	public Dog() {}

	@Override
	public void makeSound() {
		System.out.println("Woof");
	}
}
