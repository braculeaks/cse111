class Product {
    public static int count;
    public String name;
    public int price;
    public Product(String n, int p) {
        name = n;
        price = p;
        Product.count++;
    }
    public void details() {
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
    }
}


public class q63A_kni34 {
    public static void main(String[] args) {
        System.out.println("Total Products: "+Product.count);
        Book b1 = new Book("Harry Potter", 350, 23456859);
        System.out.println("1-------------");
        b1.details();
        System.out.println("ISBN Number: "+ b1.isbn);
        System.out.println("2-------------");
        Book b2 = new Book("Hamlet", 500, 37991797);
        b2.details();
        System.out.println("ISBN Number: "+ b2.isbn);
        System.out.println("3-------------");
        b1.increasePrice(200);
        System.out.println("4-------------");
        b1.details();
        System.out.println("ISBN Number: "+ b1.isbn);
        System.out.println("5-------------");
        System.out.println("Total Products: "+Product.count);
    }
}

class Book extends Product {
    int isbn;
    Book(String name, int price, int isbn){
        super(name, price);
        this.isbn = isbn;
    }
    public void increasePrice(int p){
        price += p;
        System.out.println("Price has increased");
    }
}


/*

Task for Student

Total Products: 0
1-------------
Name: Harry Potter
Price: 350
ISBN Number: 23456859
2-------------
Name: Hamlet
Price: 500
ISBN Number: 37991797
3-------------
Price has increased
4-------------
Name: Harry Potter
Price: 550
ISBN Number: 23456859
5-------------
Total Products: 2

 */