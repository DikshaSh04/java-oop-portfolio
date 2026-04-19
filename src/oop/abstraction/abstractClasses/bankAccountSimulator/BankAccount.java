package oop.abstraction.abstractClasses.bankAccountSimulator;

 abstract class BankAccount {
    //fields
    String accountHolderName;
    int accountNumber;
    double bankBalance;

    //constructor to initialize above fields
    BankAccount(String name,int accNo,double balance){
        this.accountHolderName=name;
        this.accountNumber=accNo;
        this.bankBalance=balance;

    }
    //concrete method to deposit money
    void deposit(double amount){
        bankBalance=bankBalance+amount;
        System.out.println("Deposit successful!");
    }
    //concrete method to display bank information
    void displayInfo(){
        System.out.println("Holder:"+this.accountHolderName+" | "+"Acc No.:"+this.accountNumber+" | "+"Balance:"+this.bankBalance);
    }

    //abstract method to withdraw money
     abstract void withdraw(double amount);


}
