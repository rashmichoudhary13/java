package Oops;

public class Main {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount(4523, "Sameer", 3000);
        obj.deposit(2000);
        obj.getBalance();
        float amount = obj.withdraw(3000);
        obj.getBalance();
    }
}
