package oop.abstraction.abstractClasses.bankAccountSimulator;


public class Main {
    public static void main(String[] args) {
        SavingsAccount sa=new SavingsAccount("Alice",4545,12000,4000);

        CurrentAccount ca=new CurrentAccount("Joe",5810,25000);

        //operations on savings account
        System.out.println("---------Savings Account---------");
        sa.displayInfo(); //initial status of account
        sa.deposit(2000); //deposit amount
        sa.displayInfo();
        sa.withdraw(10000); //withdrawal more than limit
        sa.displayInfo();
        sa.withdraw(4000); //withdrawal within limit
        sa.displayInfo();

        //operations on current account
        System.out.println("------------Current Account------------");
        ca.displayInfo(); //initial status of account
        ca.deposit(3000); //deposit amount
        ca.displayInfo();
        ca.withdraw(50000); //withdrawal above limit
        ca.displayInfo();
        ca.withdraw(7000); //withdrawal within limit
        ca.displayInfo();





    }
}
