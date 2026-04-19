package oop.encapsulation.hospitalPatientRecordsSystem;

public class Patient {
    //fields
    private String name;
    private int age;
    private String bloodGroup;
    private String diagnosis;
    private int prescriptionCount;

    //constructor
    Patient(String name,int age,String bloodGroup){
        this.name=name;
        setAge(age);
        this.bloodGroup=bloodGroup;
    }

    //getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getBloodGroup(){
        return bloodGroup;
    }

    public String getDiagnosis(){
        return diagnosis;
    }

    public int getPrescriptionCount(){
        return prescriptionCount;
    }

    //setters
    public void setAge(int p_age){
        if(p_age>=0 && p_age<=120){
            this.age=p_age;
            System.out.println("Age updated to "+p_age);
        }
        else{
            System.out.println("Error! Age must be between 0 and 120.");
        }

    }

    public void setDiagnosis(String diagnose){
        this.diagnosis=diagnose;
        System.out.println("Diagnosis updated to "+diagnose);
    }

    //method for incrementing prescription count
    public void addPrescription(){
        prescriptionCount+=1;
        System.out.println("Prescription #"+this.getPrescriptionCount()+" added for "+this.getName());
    }

    //display method
    public void displayInfo(){
        System.out.println("Name: "+this.getName()+"\nAge: "+this.getAge()+"\nBlood Group: "+this.getBloodGroup()+"\nDiagnosis: "+this.getDiagnosis()+"\nPrescriptions Issued: "+this.getPrescriptionCount());
    }






}
