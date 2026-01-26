package org.practiceAnswers.StasKravchenkoAnswers.Classes;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Пополнение счета " + owner + ": + " + amount + ". Новый баланс: " + balance);
        } else {
            System.out.println("Некорректная сумма для пополнения счета.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Снятие со счета " + owner + ": - " + amount + ". Новый баланс: " + balance);
        } else if (amount <= 0) {
            System.out.println("Некорректная сумма для снятия.");
        } else {
            System.out.println("Недостаточно средств на счете.");
        }
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
}
