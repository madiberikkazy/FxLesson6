import java.util.ArrayList;

public class Problem5{
    public static void main(String [] args){
        ArrayList<Book> bookArrayList = new ArrayList<>();
        Book book1 = new Book(1, "Harry Potter", "Joan Roling", "London",  2003, 320, 3000, "Saddle stitch binding");
        Book book2 = new Book(2, "Jane Air", "Martin Iden", "Almaty",  1921, 453, 1700, "Coptic stitch binding");
        Book book3 = new Book(3, "Solomon", "Tolstoy", "Atameken",  1865, 628, 990, "Coptic stitch binding");
        Book book4 = new Book(4, "Juie", "Daniyar Jigitbek", "Mura",  2017, 245, 5000, "Saddle stitch binding");
        Book book5 = new Book(5, "Physics", "Einstein", "Jihc",  1987, 408, 12700, "Saddle stitch binding");

        bookArrayList.add(book1);
        bookArrayList.add(book2);
        bookArrayList.add(book3);
        bookArrayList.add(book4);
        bookArrayList.add(book5);

        for (Book s : bookArrayList){
            if(s.getAuthor().equals("Martin Iden")){
                System.out.println(s.name + " is Martin Iden's book");
            }
        }

        for (Book s : bookArrayList){
            if(s.getPublishingHouse().equals("London")){
                System.out.println(s.name + " is London publishing house's book");
            }
        }

        for (Book s : bookArrayList){
            if (s.getYear() > 2000){
                System.out.println(s.name + " " + s.getYear());
            }
        }
    }
}

//task5 - book
class Book{
    int id;
    String name;
    String author;
    String publishingHouse;
    int year;
    int pages;
    int price;
    String typeOfBinding;

    public Book (int id, String name, String author, String publishingHouse, int year, int pages, int price, String typeOfBinding){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.typeOfBinding = typeOfBinding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }
    public String toString() {
        String result = "\nid: " + id + "  Name: " + name + "  Author: " + author + "  Izdatel: " + publishingHouse+"  Year: "+year+"  Pages: "+pages+"  Price: "+price+"  Type of binding: "+typeOfBinding;
        return result;
    }
}

