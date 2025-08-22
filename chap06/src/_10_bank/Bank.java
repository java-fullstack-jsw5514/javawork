package _10_bank;

public class Bank {
    private int balance;
    
     void deposit(int amount) {
         balance += amount;
     }
     void withdraw(int amount) {
         if (balance < amount) {
             System.out.println("Insufficient funds");
         }
         else {
             balance -= amount;
         }
     }
     int getBalance() {
         return balance;
     }
}
