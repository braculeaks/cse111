public class q59B_a5c4 {        // Kora Hoy Nai
    public static void main(String args[]){
        Borrower.bookStatus();
        System.out.println("*********1*********");
        Borrower b1 = new Borrower("Nabila");
        b1.borrowBook("Pather Panchali");
        b1.borrowBook("Anandmath");
        b1.borrowerDetails();
        System.out.println("*********2*********");
        Borrower b2 = new Borrower("Sadia");
        b2.borrowBook("Anandmath");
        b2.borrowBook("Durgesh Nandini");
        b2.borrowBook("Pather Panchali");
        b2.borrowerDetails();
        System.out.println("*********3*********");
        System.out.println(Borrower.remainingBooks("Anandmath")+"copies of Anandmath is remaining.");
        System.out.println("*********4*********");
        Borrower b3 = new Borrower("Anika");
        b3.borrowBook("Anandmath");
        Borrower.bookStatus();
        System.out.println("*********5*********");
        Borrower b4 = new Borrower("Oishi");
        b4.borrowBook("Anandmath");
        b4.borrowBook("Durgesh Nandini");
        b4.borrowerDetails();
    }
}

class Borrower{
    public static int book_count[] = {3, 3, 3};
    public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};

    // Your Code here
}

/*

Suppose you have opened a new library, from where your friends can borrow books.
Initially you have bought 3 books (Pather Panchali, Durgesh Nandini & Anandmath) each of 3 copies only.

- You are given the arrays book_count and book_name to keep track of the number of books available.
- For simplicity, assume that there will be no other books in the library.

- You must reuse the remainingBooks() method when needed.

Available Books:
Pather Panchali: 3
Durgesh Nandini: 3
Anandmath: 3
*********1*********
Name: Nabila
Books Borrowed:
Pather Panchali
Anandmath
*********2*********
Name: Sadia
Books Borrowed:
Anandmath
Durgesh Nandini
Pather Panchali
*********3*********
1 copies of Anandmath is
remaining.
*********4*********
Available Books:
Pather Panchali: 1
Durgesh Nandini: 2
Anandmath: 0
*********5*********
This book is not available.
Name: Oishi
Books Borrowed:
Durgesh Nandini

 */