package oop.inheritance.heirarchialInheritance.vehicleRegistrationSystem;

public class Vehicle {
    String ownerName;
    String registrationNo;

    //constructor
    Vehicle(String ownerName,String registrationNo){
        this.ownerName=ownerName;
        this.registrationNo=registrationNo;
    }

    //getters
    String getName(){
        return ownerName;
    }
    String getRegistrationNo(){
        return registrationNo;
    }

    //method
    String displayDetails(){
        return "Owner Name: "+getName()+"\nRegistration No: "+getRegistrationNo();

    }


}
