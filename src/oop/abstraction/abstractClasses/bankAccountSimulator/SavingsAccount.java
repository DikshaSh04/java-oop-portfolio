package oop.abstraction.abstractClasses.bankAccountSimulator;

public class SavingsAccount extends BankAccount {

    final double minBalance;

    //constructor
    SavingsAccount(String name, int accNo, double balance, double minBalance) {
        super(name, accNo, balance);
        this.minBalance=minBalance;
    }
    //implementation of abstract method
    @Override
    void withdraw(double amount) {
        if(bankBalance-amount<minBalance){
            System.out.println("Withdrawal failed! A minimum of "+this.minBalance+"Rs must be maintained.");
        }
        else{
            bankBalance=bankBalance-amount;
            System.out.println("Withdrawal of "+amount+"Rs successful!");
        }


    }
}
