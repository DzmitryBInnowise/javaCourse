package org.practiceAnswers.AlisaPauliuchenkavaAnswers.bankAccount;

public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("deposit: " + amount + ", balance: " + balance);
        } else {
            System.out.println("deposit amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("withdraw: " + amount + ", balance: " + balance);
        } else {
            System.out.println("insufficient funds");
        }
    }
}
