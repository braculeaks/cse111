public class q34B_a3u3 {        // Kora Hoy Nai
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.createBook("The Great Gatsby");
        Book book2 = new Book();
        book2.createBook("1984", "George Orwell");
        Book book3 = new Book();
        book3.createBook("To Kill a Mockingbird", "Harper Lee", "Fiction");
        System.out.println("|---Book Customization---|");
        book1.customizeGenre("Classic");
        book1.customizePages(180);
        book2.customizeGenre("Dystopian");
        book2.customizePages(328);
        book3.customizePages(281);
        System.out.println();
        System.out.println("|---Library Inventory---|");
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}


/*

|---Book Customization---|
Updated genre of "The Great Gatsby" to
Classic.
Updated pages of "The Great Gatsby" to
180 pages.
Updated genre of "1984" to Dystopian.
Updated pages of "1984" to 328 pages.
Updated pages of "To Kill a
Mockingbird" to 281 pages.
|---Library Inventory---|
Title: The Great Gatsby, Author:
Unknown, Genre: Classic, Pages: 180
Title: 1984, Author: George Orwell,
Genre: Dystopian, Pages: 328
Title: To Kill a Mockingbird, Author:
Harper Lee, Genre: Fiction, Pages: 281

 */