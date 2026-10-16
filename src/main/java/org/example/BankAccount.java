//Exercise 4.2: Bank account
//Create a BankAccount class with private fields for account holder, account number, and balance. Add a constructor and methods: - deposit(double amount) - withdraw(double amount) - getBalance()

//A deposit or withdrawal must be greater than zero. A withdrawal cannot exceed the balance. Invalid operations must not change the balance. Test valid and invalid transactions.


package org.example;

public class BankAccount {
  private String accountHolder;
  private   String accountNum;
  private   double balance;
  double amount;


  BankAccount(String accountHolder, String accountNum, double balance){
      this.accountHolder = accountHolder;
      this.accountNum = accountNum;
      this.balance = balance;
      this.amount = amount;
  }
  void deposit(double amount){
if (amount > 0){
    this.balance += amount;
    System.out.println("Successful deposit" + " " + amount);
}
else {
    System.out.println("Deposit amount must be greater than zero");
}
  }

  void withDraw(double amount){
     if (amount <= 0){
    System.out.println("Withdrawal amount must be greater then zero");
}
else if(amount > this.balance){
    System.out.println("Insufficient funds");
}
else {
    this.balance -= amount;
    System.out.println("Successfull withdrawal" + " " + amount);
}
  }
  void getBalance(){

      System.out.println("Current balance" + " " + balance);
  }




}
