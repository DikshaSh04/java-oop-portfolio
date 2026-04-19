package oop.inheritance.heirarchialInheritance.vehicleRegistrationSystem;

public class Main {
    public static void main(String[] args) {
        Car c=new Car("Rajesh Kumar","DL01AB1234","Maruti Swift");
        Truck t=new Truck("Harpal Singh","HR55CD9876",10);

        System.out.println("-----Car Details-----\n"+c.displayDetails());
        System.out.println("-----Truck Details-----\n"+t.displayDetails());

        System.out.println(c.applyForFastag());
        System.out.println(t.checkOverLoad(11));




    }
}
