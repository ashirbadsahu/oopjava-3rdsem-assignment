public class Account {
  private int accNo;
  private String accHolder;
  private double bal;

  Account(int accNo, String accHolder, double bal) {
    this.accNo = accNo;
    this.accHolder = accHolder;
    this.bal = bal;
  }

  double deposit(double amount) {
    return bal += amount;
  }

  double withdraw(double amount) {
    return bal -= amount;
  }

  public static void main(String[] args) {
    Account a = new Account(69, "TCS Bhediya", 150.00);
    System.out.println("deposit 10. avl bal: " + a.deposit(10));
    System.out.println("withdraw 20 avl bal: " + a.withdraw(20));
  }
}
