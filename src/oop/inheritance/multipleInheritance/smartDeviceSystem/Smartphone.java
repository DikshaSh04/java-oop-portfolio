package oop.inheritance.multipleInheritance.smartDeviceSystem;

public class Smartphone implements Chargeable,Connectable {
    private String deviceName;
    private int batteryLevel;

    Smartphone(String deviceName,int batteryLevel){
        this.deviceName=deviceName;
        this.batteryLevel=batteryLevel;
    }

    String getDeviceName(){
        return deviceName;
    }

    int getBatteryLevel(){
        return batteryLevel;
    }


    @Override
    public void charge() {
        System.out.println(getDeviceName()+" is charging...");
    }

    @Override
    public void showBattery() {
        System.out.println("Battery level: "+getBatteryLevel()+"%");

    }

    @Override
    public void connect(String networkName) {
        System.out.println(getDeviceName()+" connected to "+networkName);

    }

    @Override
    public void disconnect() {
        System.out.println(getDeviceName()+" disconnected from the internet.");

    }
}
