import java.time.LocalDate;

class Person {
    String fname;
    String lname;
    LocalDate bday;
    public String getFname() {return fname;}
    public String getLname() {return lname;}
    public LocalDate getBday() {return bday;}
    public void setFname(String fname) {this.fname = fname;}
    public void setLname(String lname) {this.lname = lname;}
    public void setBday(LocalDate bday) {this.bday = bday;}
    Person(String first, String last, LocalDate birth) {
        fname = first;
        lname = last;
        bday = birth;
    }
}
class Couple {
    Person bride;
    Person groom;
    public Person getBride() {return bride;}
    public Person getGroom() {return groom;}
    public void setBride(Person bride) {this.bride = bride;}
    public void setGroom(Person groom) {this.groom = groom;}
    Couple(Person wife, Person husband) {
        bride = wife;
        groom = husband;
    }
}
class Wedding {
    LocalDate weddingdate;
    Couple couple;
    String location;
    public LocalDate getWeddingdate() {return weddingdate;}
    public Couple getCouple() {return couple;}
    public String getLocation() {return location;}
    public void setWeddingdate(LocalDate weddingdate) {this.weddingdate = weddingdate;}
    public void setCouple(Couple couple) {this.couple = couple;}
    public void setLocation(String location) {this.location = location;}
    Wedding(LocalDate date, Couple cpl, String loc) {
        weddingdate = date;
        couple = cpl;
        location = loc;
    }
}

public class WeddingPlanner {
    public static void main(String[] args) {
        Person groom1 = new Person("John", "Smith", LocalDate.of(1970,1,1));
        Person bride1 = new Person("Jane", "Doe", LocalDate.of(1970,1,1));
        Person groom2 = new Person("Colonel", "Sanders", LocalDate.of(1890,9,9));
        Person bride2 = new Person("Wendy", "Thepersonnottherestaurant", LocalDate.of(1970,9,13));
        Couple couple1 = new Couple(bride1, groom1);
        Couple couple2 = new Couple(bride2, groom2);
        Wedding wedding1 = new Wedding(LocalDate.of(1999,7,25), couple1, "In the far reaches of space");
        Wedding wedding2 = new Wedding(LocalDate.of(2001,12,18), couple2, "Fourth galaxy of the Other Realm");
        printWeddingDetails(wedding1);
        printWeddingDetails(wedding2);
    }
    public static void printWeddingDetails(Wedding wedding) {
        System.out.println("Wedding date: " + wedding.getWeddingdate()
                + "\nBride: " + wedding.getCouple().getBride().getFname() + " " + wedding.getCouple().getBride().getLname() + " (born: " + wedding.getCouple().getBride().getBday() + ")"
                + "\nGroom: " + wedding.getCouple().getGroom().getFname() + " " + wedding.getCouple().getGroom().getLname() + " (born: " + wedding.getCouple().getGroom().getBday() + ")"
                + "\nLocation: " + wedding.getLocation());
    }
}