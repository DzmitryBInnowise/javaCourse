package org.practiceAnswers.KirylPalianokAnswers.secondSession.model;

public class BankAccount {

	// ЗАДАНИЕ 3.2
	// Создай класс BankAccount:
	// - owner
	// - balance
	// - методы deposit(), withdraw()
	// Проверь изменение состояния объекта

	private String owner;
	private double balance;

	public BankAccount(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Недостаточно средств.");
		}
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}
}
