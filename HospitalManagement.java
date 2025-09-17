import java.util.*;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String id, String name, int age) { this.patientId=id; this.name=name; this.age=age; }
    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void getPatientDetails() {
        System.out.println("Patient: " + name + " (ID:" + patientId + "), Age: " + age);
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String entry);
    List<String> viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private List<String> records = new ArrayList<>();
    public InPatient(String id, String name, int age, int days) { super(id,name,age); this.daysAdmitted=days; }
    @Override public double calculateBill() { return daysAdmitted * 2000 + 1500; } // ward + fixed
    @Override public void addRecord(String entry) { records.add(entry); }
    @Override public List<String> viewRecords() { return records; }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();
    public OutPatient(String id, String n, int age, double fee) { super(id,n,age); this.consultationFee=fee; }
    @Override public double calculateBill() { return consultationFee; }
    @Override public void addRecord(String entry) { records.add(entry); }
    @Override public List<String> viewRecords() { return records; }
}

public class HospitalManagement {
    public static void main(String[] args) {
        List<Patient> patients = Arrays.asList(new InPatient("P001","Maya",30,5), new OutPatient("P002","Rohit",25,500));
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
            if (p instanceof MedicalRecord) {
                MedicalRecord mr = (MedicalRecord)p;
                mr.addRecord("Checked on 2025-09-17");
                System.out.println("Records: " + mr.viewRecords());
            }
            System.out.println("---");
        }
    }
}
