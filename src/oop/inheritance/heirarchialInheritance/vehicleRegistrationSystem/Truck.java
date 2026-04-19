package oop.inheritance.heirarchialInheritance.vehicleRegistrationSystem;

public class Truck extends Vehicle{
    int maxLoadCapacity;

    Truck(String ownerName,String registrationNo,int maxLoadCapacity){
        super(ownerName,registrationNo);
        this.maxLoadCapacity=maxLoadCapacity;
    }

    int getMaxLoadCapacity(){
        return maxLoadCapacity;
    }


    String displayDetails(){
        return super.displayDetails()+"\nMax Load Capacity(in tonnes): "+getMaxLoadCapacity();
    }

    String checkOverLoad(int currentLoad){
        if(currentLoad<=maxLoadCapacity){
            return "Load is within limit.";
        }
        else{
            return "OVERLOADED! Permitted limit is "+ getMaxLoadCapacity()+ " tonnes.";
        }
    }
}
