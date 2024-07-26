package org.example;

public class BankAccount {
    // Attributes to store the balance, account holder's name, and account number
    private double balance;
    private String accountHolderName;
    private int accountNumber;

    // Static variable to generate unique account numbers
    private static int nextAccountNumber = 1;

    // Constructor to initialize the account holder's name and balance
    // Automatically assigns a unique account number
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountNumber = nextAccountNumber++;
    }

    // No-parameter constructor for user input
    // Sets default name and balance and assigns a unique account number
    public BankAccount() {
        this.accountHolderName = "Default Name";
        this.balance = 0.0;
        this.accountNumber = nextAccountNumber++;
    }

    // Method to deposit money into the account
    // Adds the specified amount to the balance if the amount is positive
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money from the account
    // Subtracts the specified amount from the balance if the amount is positive and less than or equal to the balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Method to transfer money to another account
    // Withdraws the specified amount from this account and deposits it into the specified account if the amount is valid
    public void transfer(BankAccount toAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            toAccount.deposit(amount);
        }
    }

    // Getter method to retrieve the account balance
    public double getBalance() {
        return balance;
    }

    // Getter method to retrieve the account holder's name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Getter method to retrieve the account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Overriding the toString() method to provide a string representation of the account details
    @Override
    public String toString() {
        return "Account Holder: " + accountHolderName + "\nAccount Number: " + accountNumber + "\nBalance: $" + balance;
    }
}
