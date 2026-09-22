class Product {
    public static int count = 0;
    public String name;
    public int price;
    public Product(String n, int p) {
        name = n;
        price = p;
        count++;
    }
    public void printDetails() {
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
    }
}



public class q65_kni35 {        // main function's class
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", 23456859, 300);

        System.out.println("1-------------");
        b1.printDetails();
        System.out.println("2-------------");


        Chocolate c1 = new Chocolate("Cadbury Silk", 350, "12/12/24", "12/12/25");
        c1.printDetails();

        
        System.out.println("3-------------");

        Book b2 = new Book("Hamlet", 37991797, 500);
        b2.printDetails();

        System.out.println("4-------------");
        c1.addNewFlavour("Fruit & Nut");
        System.out.println("5-------------");

        c1.printDetails();
    }
}


class Book extends Product {
    int isbn;

    Book(String n, int isbn, int p) {
        super(n, p);
        this.isbn = isbn;
    }

    @Override       // OverWrite
    public void printDetails(){
        super.printDetails();
        System.out.println("ISBN Number: "+isbn);
    }
}

class Chocolate extends Product{
    String mfg;
    String exp;
    String flav = "";

    Chocolate(String n, int p, String mfg, String exp){
        super(n, p);
        this.mfg = mfg;
        this.exp = exp;
    }

    public void addNewFlavour(String f){
        String oldName = name;
        flav = f;
        name += " "+f;

        System.out.println(oldName + " is now " + name);
    }

    // explicit is better than implicit
    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("MFG Date: "+mfg);
        System.out.println("EXP Date: "+exp);
    }
}


/*

Introducing: @override

1-------------
Name: Harry Potter
Price: 300
ISBN Number: 23456859
2-------------
Name: Cadbury Silk
Price: 350
MFG Date: 12/12/24
EXP Date: 12/12/25
3-------------
Name: Hamlet
Price: 500
ISBN Number: 37991797
4-------------
Cadbury Silk is now Cadbury Silk Fruit & Nut
5-------------
Name: Cadbury Silk Fruit & Nut
Price: 350
MFG Date: 12/12/24
EXP Date: 12/12/25

 */