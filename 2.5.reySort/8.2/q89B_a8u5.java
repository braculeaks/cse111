// Grand Parent Class 
class Library {
    public String name;

    public Library(String name) {
        this.name = name;
    }

    public void showRoomInfo() {
        System.out.println("Library Name: " + name);
    }
}

// Parent Class
class StudyRoom extends Library {
   // Write Your Code Here 
}

// Child Class 
class SilentStudyRoom extends StudyRoom {
    public SilentStudyRoom(String name) {
        super(name);
    }

    public void addBook(Library lib, StudyRoom room) {
        lib.showRoomInfo(); 
        if (room.getBook1() != null) {
            System.out.println("Adding book: " + room.getBook1());
            this.setBook1(room.getBook1());
            room.removeBook(1);
            System.out.println("Book added successfully!");
        }
        else if (room.getBook2() != null) {
            System.out.println("Adding book: " + room.getBook2());
            this.setBook2(room.getBook2());
            room.removeBook(2);
            System.out.println("Book added successfully!");
        }
        else {
            System.out.println("No books available in "+room.name);
        }
    }
}


public class a8u5 {
    public static void main(String[] args) {
        Library library = new Library("The Mind Maze");
        library.showRoomInfo();
        System.out.println("======== 1 ========");
        StudyRoom room9 = new StudyRoom("Study Hub");
        SilentStudyRoom room9A  = new SilentStudyRoom("Focus Room");
        room9.addBook("Data Structures");
        System.out.println("======== 2 ========");
        room9.addBook("Operating Systems");
        room9.showRoomInfo();
        System.out.println("======== 3 ========");
        System.out.println("Total books: " +StudyRoom.totalBooks);
        System.out.println("======== Add Book ========");
        room9A.addBook(library, room9);
        System.out.println("======== 4 ========");
        room9A.showRoomInfo();
        System.out.println("Total books: " +StudyRoom.totalBooks);
        System.out.println("======== Add Book Again ========");
        room9A.addBook(library, room9);
        System.out.println("======== 5 ========");
        room9A.showRoomInfo();
        System.out.println("Total books: " + StudyRoom.totalBooks);
    }
}

/*

Your task is to design the StudyRoom class with appropriate variables and methods such that the following tester code produces the expected output. Note: 
- Assume that each StudyRoom can add two books.
- You cannot use any arrays in the StudyRoom class.
- You should use the given Library and SilentStudyRoom classes’ variables and methods as needed.
- You cannot modify the given Library and SilentStudyRoom classes. 

Library Name: The Mind Maze
======== 1 ========
======== 2 ========
Study Hub Details:
Book 1: Data Structures
Book 2: Operating Systems
======== 3 ========
Total books: 2
======== Add Book ========
Library Name: The Mind Maze
Adding book: Data Structures
Book 1 Removed from Study Hub
Book added successfully!
======== 4 ========
Focus Room Details:
Book 1: Data Structures
No book added
Total books: 1
======== Add Book Again ========
Library Name: The Mind Maze
Adding book: Operating Systems
Book 2 Removed from Study Hub
Book added successfully!
======== 5 ========
Focus Room Details:
Book 1: Data Structures
Book 2: Operating Systems
Total books: 0

 */