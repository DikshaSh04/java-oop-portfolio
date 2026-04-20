package oop.inheritance.multipleInheritance.smartDeviceSystem;

public class Smartwatch implements Chargeable {
    private String deviceName;
    private int batteryLevel;

    Smartwatch(String deviceName,int batteryLevel){
        this.deviceName=deviceName;
        this.batteryLevel=batteryLevel;

    }

    public String getDeviceName(){
        return deviceName;
    }

    public int getBatteryLevel(){
        return batteryLevel;
    }

    void stepCount(int steps){
        System.out.println("Steps tracked: "+steps);

    }



    @Override
    public void charge() {
        System.out.println(getDeviceName()+" is charging...");
    }

    @Override
    public void showBattery() {
        System.out.println("Battery level: "+getBatteryLevel()+"%");

    }
}
