

### README.md

# Java Bank Account and Product Management

## Overview

This project demonstrates a simple bank account management system in Java. It includes a `BankAccount` class for managing bank accounts and a `Main` class for user interaction through a menu-driven interface. Users can create accounts, deposit money, withdraw money, check balances, and transfer money between accounts.

## Features

### BankAccount Class
- **Attributes:** Account holder's name, account balance, and account number.
- **Methods:**
  - `BankAccount(String accountHolderName, double balance)`: Constructor to initialize the account with a name and balance.
  - `BankAccount()`: No-parameter constructor that initializes with default values.
  - `deposit(double amount)`: Deposits a specified amount into the account.
  - `withdraw(double amount)`: Withdraws a specified amount from the account.
  - `transfer(BankAccount toAccount, double amount)`: Transfers a specified amount to another account.
  - `getBalance()`: Returns the account balance.
  - `getAccountHolderName()`: Returns the account holder's name.
  - `getAccountNumber()`: Returns the account number.
  - `toString()`: Returns a string representation of the account details.

### Main Class
- **Attributes:** An `ArrayList` to store all bank accounts.
- **Methods:**
  - `main(String[] args)`: Main method to start the program and display the main menu.
  - `createAccount(Scanner scanner)`: Creates a new bank account and adds it to the accounts list.
  - `accessAccount(Scanner scanner)`: Accesses an existing bank account by account number.
  - `findAccount(int accountNumber)`: Finds a bank account by account number.
  - `mainMenu(BankAccount account, Scanner scanner)`: Displays the main menu for the given bank account and handles user input.

## Project Structure

```
├── src
│   └── main
│       └── java
│           └── org
│               └── example
│                   ├── BankAccount.java
│                   └── Main.java
└── README.md
```

## Setup

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/java-bank-account-management.git
   ```

2. **Navigate to the project directory:**

   ```bash
   cd java-bank-account-management
   ```

3. **Compile the project:**

   ```bash
   javac -d out src/main/java/org/example/*.java
   ```

4. **Run the project:**

   ```bash
   java -cp out org.example.Main
   ```

## Usage

Once the program is running, follow the on-screen prompts to interact with the bank account system. The main menu allows you to:
1. Create a new account
2. Access an existing account
3. Exit the program

Within the account menu, you can:
1. Check the account balance
2. Deposit money
3. Withdraw money
4. Transfer money to another account
5. Exit to the main menu

### Example Interaction

**Creating an Account:**

```
1. Create new account
2. Access existing account
3. Exit
Enter your choice: 1
Enter account holder name: Alice
Enter initial balance: 5000
Account created successfully!
Account Holder: Alice
Account Number: 1
Balance: $5000.0

Welcome, Alice
1. Check balance
2. Deposit
3. Withdraw
4. Transfer
5. Exit
Enter your choice: 1
Balance: $5000.0
```

**Accessing an Existing Account and Making Transactions:**

```
1. Create new account
2. Access existing account
3. Exit
Enter your choice: 2
Enter account number: 1

Welcome, Alice
1. Check balance
2. Deposit
3. Withdraw
4. Transfer
5. Exit
Enter your choice: 2
Enter deposit amount: 1000
Deposit successful!

Welcome, Alice
1. Check balance
2. Deposit
3. Withdraw
4. Transfer
5. Exit
Enter your choice: 1
Balance: $6000.0
```

**Transferring Money Between Accounts:**

```
1. Create new account
2. Access existing account
3. Exit
Enter your choice: 1
Enter account holder name: Bob
Enter initial balance: 300
Account created successfully!
Account Holder: Bob
Account Number: 2
Balance: $300.0

Welcome, Bob
1. Check balance
2. Deposit
3. Withdraw
4. Transfer
5. Exit
Enter your choice: 4
Enter the account number to transfer to: 1
Enter transfer amount: 100
Transfer successful!

Welcome, Bob
1. Check balance
2. Deposit
3. Withdraw
4. Transfer
5. Exit
Enter your choice: 1
Balance: $200.0

1. Create new account
2. Access existing account
3. Exit
Enter your choice: 2
Enter account number: 1

Welcome, Alice
1. Check balance
2. Deposit
3. Withdraw
4. Transfer
5. Exit
Enter your choice: 1
Balance: $6100.0
```

## Contributing

If you'd like to contribute to this project, please fork the repository and use a feature branch. Pull requests are welcome.

1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a new Pull Request.

## License

This project is licensed under the MIT License. See the LICENSE file for more information.
```

This README file provides a comprehensive overview of the project, including its features, setup instructions, usage guide, example interactions, and contribution guidelines. This should help anyone understand and work with your project effectively.
