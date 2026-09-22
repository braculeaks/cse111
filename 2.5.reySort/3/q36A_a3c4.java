public class q36A_a3c4 {            // Kora Hoy Nai
    public static void main(String[] args) {
        Library a1 = new Library(3);
        System.out.println("1-------------");
        a1.addBook("Ice");
        System.out.println("2-------------");
        a1.printDetail();
        System.out.println("3-------------");
        a1.addBook("Emma");
        a1.addBook("Wings");
        a1.addBook("Next");
        System.out.println("4-------------");
        a1.printDetail();
        System.out.println("5-------------");
        Library a2 = new Library(4);
        System.out.println("6-------------");
        a2.addBook("Onnobhubon");
        a2.addBook("Ami");
        System.out.println("7-------------");
        a2.printDetail();
        System.out.println("8-------------");
        a2.addBook("Deyal");
        a2.addBook("Himu");
        a2.addBook("Megher Upor Bari");
        System.out.println("9-------------");
        a2.printDetail();
    }
}

/*

A library has been created with capacity 3
1-------------
Book 'Ice' added to the library
2-------------
Maximum Capacity: 3
Total Books: 1
Book list:
Ice
3-------------
Book 'Emma' added to the library
Book 'Wings' added to the library
Exceeds maximum capacity. You can't add
more than 3 books
4-------------
Maximum Capacity: 3
Total Books: 3
Book list:
Ice
Emma
Wings
5-------------
A library has been created with capacity 4
6-------------
Book 'Onnobhubon' added to the library
Book 'Ami' added to the library
7-------------
Maximum Capacity: 4
Total Books: 2
Book list:
Onnobhubon
Ami
8-------------
Book 'Deyal' added to the library
Book 'Himu' added to the library
Exceeds maximum capacity. You can't add
more than 4 books
9-------------
Maximum Capacity: 4
Total Books: 4
Book list:
Onnobhubon
Ami
Deyal
Himu

 */