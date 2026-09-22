public class q63B_a6h3 {
    public static void main(String[] args) {
        Book book = new Book(1, "The Alchemist", 500, "97806", "HarperCollins");
        book.printDetail();
        System.out.println("-----------------------");
        
        CD cd = new CD(2, "Shotto", 300, "Warfaze", 50, "Hard Rock");
        cd.printDetail();
    }
}

class Product {
    private int id;
    private String title;
    private int price;
    
    public Product(int id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }
    
    public String getIdTitlePrice() {
        return "ID: " + id + "\nTitle: " + title + "\nPrice: " + price + "\n";
    }
}

class Book extends Product {
    String isbn;
    String p;

    Book(int id, String title, int price, String isbn, String p) {
        super(id, title, price);
        this.isbn  = isbn;
        this.p = p;
    }
    
    public void printDetail() {
        System.out.println(getIdTitlePrice() + "ISBN: " + isbn + "\nPublisher: " + p); 
    }
}

class CD extends Product {
    String band;
    int dur;
    String genre;

    CD(int id, String title, int price, String band, int dur, String genre){
        super(id, title, price);
        this.band = band;
        this.dur = dur;
        this.genre = genre;
    }

    public void printDetail(){
        System.out.println(getIdTitlePrice() + "Band: " + band + "\nDuration: " + dur + " minutes\nGenre: " + genre);
    }
}


/*

Introducing: 2 child from 1 parent
Task for Student

ID: 1
Title: The Alchemist
Price: 500
ISBN: 97806
Publisher: HarperCollins
-----------------------
ID: 2
Title: Shotto
Price: 300
Band: Warfaze
Duration: 50 minutes
Genre: Hard Rock

 */