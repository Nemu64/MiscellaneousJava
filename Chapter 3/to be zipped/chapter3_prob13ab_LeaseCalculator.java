import java.util.Scanner;
import static java.lang.System.*;

class Lease {
    String tenantsName;
    String aptNum;
    float monthlyRent;
    int lengthOfLease;
    public String getTenantsName() {return tenantsName;}
    public String getAptNum() {return aptNum;}
    public float getMonthlyRent() {return monthlyRent;}
    public int getLengthOfLease() {return lengthOfLease;}
    public void setTenantsName(String name) {this.tenantsName = name;}
    public void setAptNum(String apt) {this.aptNum = apt;}
    public void setMonthlyRent(float rent) {this.monthlyRent = rent;}
    public void setLengthOfLease(int months) {this.lengthOfLease = months;}
    public void addPetFee() {
        this.monthlyRent = monthlyRent + 10;
        explainPetPolicy();
    }
    public Lease() {
        tenantsName = "XXX";
        aptNum = "0";
        monthlyRent = 1000;
        lengthOfLease = 12;
    }
    public static void explainPetPolicy() {
        out.println("\n\u001B[31mThere is a $10 monthly fee for pet owners.\u001B[0m"); //text is supposed to appear red. May not work in eclipse but it works in intellij
    }
}
public class chapter3_prob13ab_LeaseCalculator {
    static Scanner kbd = new Scanner(in);
    public static void main(String[] args) {
        Lease[] leases = {new Lease(), new Lease(), new Lease(), new Lease()};
        getData(leases);
        printValues(leases[0]);
        leases[0].addPetFee();
        for (Lease lease : leases) {
            printValues(lease);
        }
    }
    public static void getData(Lease[] currentlease) {
        for (int i = 0; i < 3; i++) {
            out.print("\nEnter the tenant's name: ");
            currentlease[i].setTenantsName(kbd.next());
            out.print("Enter the apartment number: ");
            currentlease[i].setAptNum(kbd.next());
            out.print("Enter the monthly rent: ");
            currentlease[i].setMonthlyRent(kbd.nextFloat());
            out.print("Enter the length of the lease: ");
            currentlease[i].setLengthOfLease(kbd.nextInt());
        }
    }
    public static void printValues(Lease lease) {
        out.print("\n\nTenant name: " + lease.getTenantsName() + "\nApartment #: " + lease.getAptNum() + "\nMonthly rent: $" + String.format("%.2f", lease.getMonthlyRent()) + "\nLength of lease: " + lease.getLengthOfLease() + " months");
    }
}