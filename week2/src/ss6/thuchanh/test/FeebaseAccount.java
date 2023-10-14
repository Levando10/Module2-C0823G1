package ss6.thuchanh.test;

public class FeebaseAccount extends Account {


  double fee = 100;

  @Override
  public void withdraw(double money) {
    super.withdraw(money);
    balance -= fee;
  }

  public static void main(String[] args) {
    FeebaseAccount feebaseAccount = new FeebaseAccount();
    feebaseAccount.depoit(5000000);
    feebaseAccount.withdraw(1);
    System.out.println(feebaseAccount.balance);
  }
}
