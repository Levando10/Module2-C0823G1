package ss6.thuchanh.test;

public class Account {

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public Account() {
  }

  public double balance = 0;

  public void depoit(double money) {
    balance += money;
  }

  public void withdraw(double money) {
    balance -= money;
  }


}
