package org.practiceAnswers.KirylPalianokAnswers.thirdSession.model.example;

public class Example {

	// Задание 9.1 — Private и public
	/*
	 * Создайте класс Example с полем private int x
	 * Попробуйте обратиться к x из другого класса (должна быть ошибка, IDE так же не позволит этого сделать)
	 * Создайте public метод getX(), чтобы получить значение x
	 */

	private int x;

	public Example(int x) {
		this.x = x;
	}

	public Example() {}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

}
