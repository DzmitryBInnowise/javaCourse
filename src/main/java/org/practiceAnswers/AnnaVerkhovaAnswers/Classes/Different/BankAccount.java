package org.practiceAnswers.AnnaVerkhovaAnswers.Classes.Different;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void deposit(double summa) {
        balance += summa;
        System.out.println("The balance has been increased by " + summa);
    }

    public void withdraw(double summa) {
        if (balance >= summa) {
            balance -= summa;
            System.out.println("The amount withdrawn from the account " + summa);
        } else {
            System.out.println("Not enough funds");
        }

    }

    public double getBalance() {
        System.out.println("Balance = " + balance);
        return balance;
    }
}