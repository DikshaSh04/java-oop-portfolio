package oop.abstraction.abstractClasses.bankAccountSimulator;

public class CurrentAccount extends BankAccount{

    final double overdraftLimit=1000;

    CurrentAccount(String name, int accNo, double balance){
        super(name,accNo,balance);
    }

    @Override
    void withdraw(double amount){
        if(bankBalance-amount< -overdraftLimit){
            System.out.println("Withdrawal failed! Overdraft limit of 1000Rs exceeded.");

        }
        else{
            bankBalance=bankBalance-amount;
            System.out.println("Withdrawal of "+amount+"Rs successful!");
        }

    }




}


