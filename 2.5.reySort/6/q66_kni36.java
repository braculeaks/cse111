class Product {
    public static int count = 0;
    public String name;
    public int price;
    public Product(String n, int p) {
        name = n;
        price = p;
        count++;
    }
    public void details() {
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
    }
}


public class q66_kni36 {
public static void main(String args[]) {
        Book b1 = new Book("Harry Potter", 23456859, 300);
        System.out.println("1-------------");
        b1.details();
        System.out.println("2-------------");
        b1.updateIsbn(23456857);
        System.out.println("3-------------");
        b1.details();
        System.out.println("4-------------");
        EBook sb1 = new EBook("The Little Prince", 2345346, 400, false);
        sb1.details();
        System.out.println("5-------------");
        sb1.updateIsbn(23453469);
        System.out.println("6-------------");
        sb1.details();
    }
}

class Book extends Product{
    int isbn;

    Book(String n, int isbn, int p){
        super(n, p);
        this.isbn = isbn;
    }

    public void updateIsbn(int newISBN){
        isbn = newISBN;
        System.out.println("ISBN Updated!");
    }

    @Override
    public void details(){
        super.details();
        System.out.println("ISBN number: "+isbn);
    }
}

class EBook extends Book{

    boolean link = false;

    EBook(String n, int isbn, int p, boolean link){
        super(n, isbn, p);
        this.link = link;
    }

    @Override
    public void details(){
        String avail;
            if(link) avail = "true";
            else     avail = "false";

        super.details();
        System.out.println("Download Link Available?:"+avail);
    }
}


/*

Introducing: MultiLevel Inheritance

1-------------
Name: Harry Potter
Price: 300
ISBN Number: 23456859
2-------------
ISBN Updated!
3-------------
Name: Harry Potter
Price: 300
ISBN Number: 23456857
4-------------
Name: The Little Prince
Price: 400
ISBN Number: 2345346
Download Link Available?:false
5-------------
ISBN Updated!
6-------------
Name: The Little Prince
Price: 400
ISBN Number: 23453469
Download Link Available?:false

 */