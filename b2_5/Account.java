package org.example.b2_5;
public class Account {
    private Customer customer;
    private double balance;
    public Account(Customer customer, double balance) {
        this.customer = customer;
        this.balance = balance;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
    public void transfer(Account toAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transferred " + amount + " to " + toAccount.getCustomer().getName());
        } else {
            System.out.println("Invalid transfer amount or insufficient funds.");
        }
    }
    @Override
    public String toString() {
        return "Account[customer=" + customer + ", balance=" + balance + "]";
    }
}
