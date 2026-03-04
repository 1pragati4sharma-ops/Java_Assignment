package Assignment_Java.Mod3.OOPS;

import java.util.Scanner;

public class BankAccount {
    private int accountNumber;//Encapsulation
    private double balance;
    BankAccount(int accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println("Amount deposited:"+amount);
        System.out.println("Total Balance is "+balance);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount deducted is " + amount + " Remaining Balance is " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
        void displayDetails(){
            System.out.println("Account Number:"+accountNumber);
            System.out.println("Current Balance:"+balance);
        }
}
class Driver{
    public static void main(String[] args) {
        BankAccount b1=new BankAccount(890,4000.907);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to be deposited:");
        double amount=sc.nextDouble();
        b1.deposit(amount);
        System.out.println("Enter the amount to be withdrawn:");
        double amount1=sc.nextDouble();
        b1.withdraw(amount1);
        b1.displayDetails();
    }
}

