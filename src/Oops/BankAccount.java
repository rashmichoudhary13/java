package Oops;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private float balance;

    public BankAccount(int an, String name, float bal){
        this.accountNumber = an;
        this.accountHolderName = name;
        this.balance = bal;
    }

    public void deposit(int amount){
        if(amount <= 0){
            System.out.println("Invalid deposit");
        } else {
            balance += amount;
            System.out.println("Amount credited successfully");
        }
    }

    public float withdraw(int amount){
        if(amount <= 0){
            System.out.println("Invalid Withdrawal");
        }
        else if(amount > balance){
            System.out.println("Not enough balance to withdraw.");
        } else {
            balance -= amount;
            System.out.println("Amount debited successfully");
        }
        return amount;
    }

    public void getBalance(){
        System.out.println("Current balance is: " + this.balance);
    }
}
