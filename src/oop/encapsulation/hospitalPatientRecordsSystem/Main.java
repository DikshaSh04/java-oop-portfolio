package oop.encapsulation.hospitalPatientRecordsSystem;

public class Main {
    public static void main(String[] args) {
        Patient p1=new Patient("Brock",25,"B+");

        p1.setAge(200);
        p1.setAge(30);
        p1.setDiagnosis("Viral Fever");
        p1.addPrescription();

        System.out.println("--------Patient Record--------");
        p1.displayInfo();
    }
}
