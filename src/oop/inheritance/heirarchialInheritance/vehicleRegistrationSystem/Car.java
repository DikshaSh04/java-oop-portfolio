package oop.inheritance.heirarchialInheritance.vehicleRegistrationSystem;

public class Car extends Vehicle {
    String carModel;

    //constructor
    Car(String ownerName,String registrationNo,String carModel){
        super(ownerName,registrationNo);
        this.carModel=carModel;
    }

    String getCarModel(){
        return carModel;
    }

    @Override
    String displayDetails(){
       return super.displayDetails()+"\nCar model: "+getCarModel();

    }

    String applyForFastag(){
        return "Fastag applied for car: "+getRegistrationNo();
    }

}
