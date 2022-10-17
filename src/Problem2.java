import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Problem2 {
    public static void main (String[] args) {
        Buyer student1 = new Buyer(1, "Madi", "Berikkazy", "Mukhitzhnauly", 1282004, "Merke", "87021874596");
        Buyer student2 = new Buyer(2, "Jomart", "Aldabay", "Pomart", 2572003, "Taraz", "87725487856");
        Buyer student3 = new Buyer(3, "Jalgas", "Palgas", "Salgas", 1632004, "Almaty", "87024587891");
        Buyer student4 = new Buyer(4, "Doni", "Poni", "Qoni", 18102005, "Shyym", "87056428404");
        Buyer student5 = new Buyer(5, "Nurik", "Purik", "Shurik", 2532005, "Balasagun 55", "87056408505");

        ArrayList<Buyer> list3E = new ArrayList<>();
        list3E.add(student1);
        list3E.add(student2);
        list3E.add(student3);
        list3E.add(student4);
        list3E.add(student5);

        Collections.sort(list3E, new SortByName());
        for (Buyer s : list3E){
            System.out.println(s);
        }
        for (Buyer s : list3E){
            if (s.getCreditNumber() > 1500000 && s.getCreditNumber() < 2500000){
                System.out.println(s.getName() + " " + s.getSourname() + " " + s.getSourname());
            }
        }

    }
}
class  Buyer{
    int id;
    String name;
    String sourname;
    String fatherhood;
    String address;
    int creditNumber;
    String phoneNumber;

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
    public Buyer(int id,String name,String sourname ,String fatherhood,int creditNumber,String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.sourname = sourname;
        this.fatherhood = fatherhood;
        this.address = address;
        this.creditNumber=creditNumber;
        this.phoneNumber = phoneNumber;
    }
    public String toString() {
        String result = "\nid: " + id + "  Name: " + name + "  Sourname: " + sourname + "  Fatherhood: " + fatherhood+"  CreditCard: "+creditNumber+"  Address: "+address+"  Phone number: "+phoneNumber;
        return result;
    }
}
class SortByName implements Comparator<Buyer> {
    @Override
    public int compare(Buyer name1, Buyer name2) {
        return name1.getName().compareTo(name2.getName());
    }
}