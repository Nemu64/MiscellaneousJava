class BloodData {
    String bloodtype;
    String Rh;
    public String getBloodtype() {return bloodtype;}
    public String getRh() {return Rh;}
    public void setBloodtype(String type) {this.bloodtype = type;}
    public void setRh(String rh) {this.Rh = rh;}
    BloodData() {
        bloodtype = "O";
        Rh = "+";
    }
    BloodData(String type, String rh) {
        bloodtype = type;
        Rh = rh;
    }
}
class Patient {
    int patientID;
    int age;
    BloodData blood;
    public int getPatientID() {return patientID;}
    public int getAge() {return age;}
    public BloodData getBlood() {return blood;}
    Patient() {
        patientID = 0;
        age = 0;
        blood = new BloodData();
    }
    Patient(int ID, int ptage, String bloodtype, String rh) {
        patientID = ID;
        age = ptage;
        blood = new BloodData(bloodtype, rh);

    }
}
public class Blood {
    public static void main(String[] args) {
        var genericblood = new BloodData();
        System.out.println("Type: " + genericblood.getBloodtype() + "\nRh: " + genericblood.getRh());
        var ABblood = new BloodData("AB", "-");
        System.out.println("Type: " + ABblood.getBloodtype() + "\nRh: " + ABblood.getRh());
        var genereicpatient = new Patient();
        System.out.println("\n\nPatient ID: " + genereicpatient.getPatientID() + "\nAge: " + genereicpatient.getAge() + "\nBlood type: " + genereicpatient.getBlood().getBloodtype() + "\nRh: " + genereicpatient.getBlood().getRh());
        var patient = new Patient(1234, 25, "AB", "-");
        System.out.println("Patient ID: " + patient.getPatientID() + "\nAge: " + patient.getAge() + "\nBlood type: " + patient.getBlood().getBloodtype() + "\nRh: " + patient.getBlood().getRh());
    }
}