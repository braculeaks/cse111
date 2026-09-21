public class Book extends Product {     /* a6q3 */
    String isbn;
    String publisher;
    
    Book(int id, String n, int p, String i, String pub) {
        super(id, n, p);
        isbn = i;
        publisher = pub;
    }

    String printDetail() {
        return super.getIdTitlePrice() + " ISBN: " + isbn + " Publisher: " + publisher;
    }
}

class CD extends Product {
    String band;
    int duration;
    String category;

    CD(int id, String n, int p, String band, int d, String cat) {
        super(id, n, p);
        this.band = band;
        this.duration = d;
        this.category = cat;
    }

    String printDetail() {
        return super.getIdTitlePrice() + "\n"
        + "Band: " + band + " Duration: " + duration + " minutes Genre: " + category;
    }
}
