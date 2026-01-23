package org.practiceAnswers.AnnaVerkhovaAnswers.SecondSession;

class BankAccount {
    private String owner;
    private double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    void deposit(double summa) {
        balance += summa;
        System.out.println("The balance has been increased by " + summa);
    }

    void withdraw(double summa) {
        if (balance >= summa) {
            balance -= summa;
            System.out.println("The amount withdrawn from the account " + summa);
        } else {
            System.out.println("Not enough funds");
        }

    }

    double getBalance() {
        System.out.println("Balance = " + balance);
        return balance;
    }
}