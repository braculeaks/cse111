public class q37_adu5 {
public static void main(String[] args){
        Reader r1 = new Reader();           // albert
        Reader r2 = new Reader();

        r1.createReader("Albert", 2);       // albert
        r2.createReader("Issac", 5);

        System.out.println("1 ==========");
        r1.readerInfo();                    // albert

        System.out.println("2 ==========");
        r2.addBook("Java");
        r2.addBook("Python");
        r2.addBook("C++");
        r2.readerInfo();

        System.out.println("3 ==========");
        r1.addBook("C#");
        r1.addBook("Rust");
        r1.addBook("GoLang");

        System.out.println("4 ==========");
        r1.increaseCapacity(5);
        r1.addBook("Python");
        
        System.out.println("5 ==========");
        r1.readerInfo();
    }
}


/*

1 ==========
Name: Albert
Capacity: 2
Books:
No books added yet
2 ==========
Name: Issac
Capacity: 5
Books:
Book 1: Java
Book 2: Python
Book 3: C++
3 ==========
No more space for new book
4 ==========
Albert's capacity increased to 5
5 ==========
Name: Albert
Capacity: 5
Books:
Book 1: C#
Book 2: Rust
Book 3: Python

 */