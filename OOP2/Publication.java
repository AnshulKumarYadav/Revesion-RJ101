package OOP2;
import java.util.*;
public abstract class Publication {

    public int noOfPages;
    public double price;
    public String name;

    public Publication(){}

    public Publication(int noOfPages, double price, String name) {
        this.noOfPages = noOfPages;
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Publication [name=" + name + ", noOfPages=" + noOfPages + ", price=" + price + "]";
    }

    

}

class Book extends Publication {

    public Book(){}

    public Book(int noOfPages, double price, String name) {
        super(noOfPages, price, name);
    }

}

class Journal extends Publication {

    public Journal(){}

    public Journal(int noOfPages, double price, String name) {
        super(noOfPages, price, name);
    }
}

class Library{
    public static List<Publication> pulications = new ArrayList<>();

    public static void main(String[] args) {
        Publication book1 = new Book(200, 1000, "HolyFaith");
        Publication book2 = new Book(500, 3000, "Dark of Haven");
        Publication book3 = new Book(100, 300,"Three Man in the boat");

        Publication journal1 = new Journal(30, 50, "Dykon Lance");
        Publication journal2 = new Journal(20,100,"Branin Trace");

        pulications.add(book1);
        pulications.add(book2);
        pulications.add(book3);
        pulications.add(journal1);
        pulications.add(journal2);

        Library library = new Library();
        List<Publication> publications  = library.pulications; 

        for(Publication pb : publications)
        {
           System.out.println(pb.toString());
        }

    }
}