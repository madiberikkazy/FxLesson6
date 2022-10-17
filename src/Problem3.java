import java.util.ArrayList;

public class Problem3 {
    public static void main (String[] args) {
        Patient student1 = new Patient(1, "Madi", "Berikkazy", "Mukhitzhnauly", 1282004, "Merke", "87021874596","Tumau");
        Patient student2 = new Patient(2, "Jomart", "Aldabay", "Pomart", 2572003, "Taraz", "87725487856","Tuburkulez");
        Patient student3 = new Patient(3, "Jalgas", "Palgas", "Salgas", 1632004, "Almaty", "87024587891","Tuburkulez");
        Patient student4 = new Patient(4, "Doni", "Poni", "Qoni", 18102005, "Shyym", "87056428404","Bas Auru");
        Patient student5 = new Patient(5, "Nurik", "Purik", "Shurik", 2532005, "Balasagun 55", "87056408505","Rak");

        ArrayList<Patient> list3E = new ArrayList<>();
        list3E.add(student1);
        list3E.add(student2);
        list3E.add(student3);
        list3E.add(student4);
        list3E.add(student5);

        for (Patient s : list3E){
            if(s.getAuru().equals("Rak")){
                System.out.println("Rakpen auyratyn : " + s);
            }
        }

        for (Patient s : list3E){
            if (s.getCreditNumber() > 1500000 && s.getCreditNumber() < 2500000){
                System.out.println("Qajetti karta: "+s);
            }
        }

    }
}
class  Patient{
    int id;
    String name;
    String sourname;
    String fatherhood;
    String address;
    int creditNumber;
    String phoneNumber;
    String auru;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSourname() {
        return sourname;
    }
    public void setSourname(String sourname) {
        this.sourname = sourname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setFatherhood(String fatherhood) {
        this.fatherhood = fatherhood;
    }
    public int getCreditNumber() {
        return creditNumber;
    }
    public void setCreditNumber(int creditNumber) {
        this.creditNumber = creditNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAuru() {
        return auru;
    }
    public void setAuru(String auru) {
        this.auru = auru;
    }
    public Patient(int id,String name,String sourname ,String fatherhood,int creditNumber,String address, String phoneNumber,String auru) {
        this.id = id;
        this.name = name;
        this.sourname = sourname;
        this.fatherhood = fatherhood;
        this.address = address;
        this.creditNumber=creditNumber;
        this.phoneNumber = phoneNumber;
        this.auru = auru;
    }
    public String toString() {
        String result = "\nid: " + id + "  Name: " + name + "  Sourname: " + sourname + "  Fatherhood: " + fatherhood+"  CreditCard: "+creditNumber+"  Address: "+address+"  Phone number: "+phoneNumber+"  Auru; "+auru;
        return result;
    }
}