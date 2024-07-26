package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // ArrayList to store all bank accounts
    private static ArrayList<BankAccount> accounts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop to display the main menu until the user chooses to exit
        while (true) {
            System.out.println("1. Create new account");
            System.out.println("2. Access existing account");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Handle user's choice
            if (choice == 1) {
                createAccount(scanner);
            } else if (choice == 2) {
                accessAccount(scanner);
            } else if (choice == 3) {
                break; // Exit the loop and terminate the program
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    // Method to create a new bank account
    private static void createAccount(Scanner scanner) {
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        // Create a new BankAccount object and add it to the accounts list
        BankAccount newAccount = new BankAccount(name, balance);
        accounts.add(newAccount);

        System.out.println("Account created successfully!");
        System.out.println(newAccount);

        // Display the main menu for the newly created account
        mainMenu(newAccount, scanner);
    }

    // Method to access an existing bank account
    private static void accessAccount(Scanner scanner) {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Find the account by account number
        BankAccount account = findAccount(accountNumber);

        // If the account exists, display the main menu for that account
        if (account != null) {
            mainMenu(account, scanner);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to find a bank account by account number
    private static BankAccount findAccount(int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null; // Return null if no account with the given number is found
    }

    // Method to display the main menu for the given bank account
    private static void mainMenu(BankAccount account, Scanner scanner) {
        while (true) {
            System.out.println("\nWelcome, " + account.getAccountHolderName());
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Handle user's choice
            if (choice == 1) {
                System.out.println("Balance: $" + account.getBalance());
            } else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                account.deposit(amount);
                System.out.println("Deposit successful!");
            } else if (choice == 3) {
                System.out.print("Enter withdrawal amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                account.withdraw(amount);
                System.out.println("Withdrawal successful!");
            } else if (choice == 4) {
                System.out.print("Enter the account number to transfer to: ");
                int toAccountNumber = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                BankAccount toAccount = findAccount(toAccountNumber);
                if (toAccount != null) {
                    System.out.print("Enter transfer amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    account.transfer(toAccount, amount);
                    System.out.println("Transfer successful!");
                } else {
                    System.out.println("Target account not found.");
                }
            } else if (choice == 5) {
                break; // Exit the loop and return to the main menu
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
