import java.util.ArrayList;
import java.util.List;

interface Account {
  void deposit(double amount);

  void withdraw(double amount);

  double calculateInterest();

  double getBalance();
}

class SavingsAccount implements Account {
  private double balance;
  private double interestRate;

  public SavingsAccount(double initialBalance, double interestRate) {
    this.balance = initialBalance;
    this.interestRate = interestRate;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposited: " + amount);
    } else {
      System.out.println("Deposit amount must be positive.");
    }
  }

  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrew: " + amount);
    } else {
      System.out.println("Insufficient funds or invalid amount.");
    }
  }

  public double calculateInterest() {
    return balance * interestRate;
  }

  public double getBalance() {
    return balance;
  }
}

class CurrentAccount implements Account {
  private double balance;

  public CurrentAccount(double initialBalance) {
    this.balance = initialBalance;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposited: " + amount);
    } else {
      System.out.println("Deposit amount must be positive.");
    }
  }

  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrew: " + amount);
    } else {
      System.out.println("Insufficient funds or invalid amount.");
    }
  }

  public double calculateInterest() {
    return 0;
  }

  public double getBalance() {
    return balance;
  }
}

class Bank {
  private List<Account> accounts;

  public Bank() {
    this.accounts = new ArrayList<>();
  }

  public void addAccount(Account account) {
    accounts.add(account);
    System.out.println("Account added.");
  }

  public void displayBalances() {
    for (Account account : accounts) {
      System.out.println("Balance: " + account.getBalance());
    }
  }
}

public class BankingSystem {
  public static void main(String[] args) {
    Bank bank = new Bank();
    SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
    CurrentAccount currentAccount = new CurrentAccount(2000);
    bank.addAccount(savingsAccount);
    bank.addAccount(currentAccount);
    savingsAccount.deposit(200);
    savingsAccount.withdraw(150);
    System.out.println("Savings Account Interest: " + savingsAccount.calculateInterest());
    currentAccount.deposit(500);
    currentAccount.withdraw(300);
    bank.displayBalances();
  }
}
