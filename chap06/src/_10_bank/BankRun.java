package _10_bank;

import java.lang.reflect.Field;

public class BankRun {
    public static void main(String[] args) {
        Bank bank = new Bank();
        try {
            Field field = bank.getClass().getDeclaredField("balance");
            field.setAccessible(true);
            System.out.println(field.get(bank));
            field.set(bank, 10000000);
            System.out.println(field.get(bank));
//            bank.balance = 10000000;
//            System.out.println("잔액 : " + bank.balance);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("잔액: "+bank.getBalance());
    }
}
