package ExercicioDois;

public class CheckingAccount {
  private String accountNumber;
  private String holder;
  private double balance = 0.0;

  public CheckingAccount(String accountNumber, String holder, double balance) {
    this.accountNumber = accountNumber;
    this.holder = holder;
    this.balance = balance;
  }

  public CheckingAccount(String accountNumber, String holder) {
    this.accountNumber = accountNumber;
    this.holder = holder;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double value) {
    balance = balance + value;
  }

  public void draft(double value) {
    balance = balance - value;
  }

  @Override
  public String toString() {
    return "CheckingAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", holder=" + holder + "]";
  }
 
}
