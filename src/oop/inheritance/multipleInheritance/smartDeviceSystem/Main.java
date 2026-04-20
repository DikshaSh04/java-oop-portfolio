package oop.inheritance.multipleInheritance.smartDeviceSystem;

public class Main {
    public static void main(String[] args) {
        Smartphone s=new Smartphone("Iphone 15",85);
        Smartwatch w=new Smartwatch("Galaxy Watch",60);
        Laptop l=new Laptop("Macbook Pro");

        System.out.println("-----Smartphone-----");
        s.charge();
        s.showBattery();
        s.connect("Home_Wifi");
        s.disconnect();

        System.out.println("-----SmartWatch-----");
        w.charge();
        w.showBattery();
        w.stepCount(8432);

        System.out.println("-----Laptop-----");
        l.connect("Office_Wifi");
        l.disconnect();
        l.runProgram("IntelliJ Idea");
    }
}
