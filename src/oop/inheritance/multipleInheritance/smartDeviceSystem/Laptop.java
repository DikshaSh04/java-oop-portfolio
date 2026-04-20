package oop.inheritance.multipleInheritance.smartDeviceSystem;

public class Laptop implements Connectable {
    private String deviceName;

    Laptop(String deviceName){
        this.deviceName=deviceName;

    }

    String getDeviceName(){
        return deviceName;
    }

    void runProgram(String program){
        System.out.println("Running: "+program);
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
