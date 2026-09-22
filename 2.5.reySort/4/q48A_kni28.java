public class q48A_kni28 {       // Kora Hoy Nai
    public static void main(String[] args) {
        BracuStudent st1 = new BracuStudent("Afif", "Mirpur");
        System.out.println("1===============");
        BracuStudent st2 = new BracuStudent("Shanto", "Motijheel");
        BracuStudent st3 = new BracuStudent("Taskin", "Mirpur");
        st1.showDetails();
        st2.showDetails();
        System.out.println("2===============");
        st3.showDetails();
        System.out.println("3===============");
        BracuBus bus1 = new BracuBus("Mirpur");
        BracuBus bus2 = new BracuBus("Azimpur", 5);
        bus1.showDetails();
        bus2.showDetails();
        System.out.println("4===============");
        st2.collectPass();
        st3.collectPass();
        System.out.println("5===============");
        st2.showDetails();
        st3.showDetails();
        System.out.println("6===============");
        bus1.board();
        System.out.println("7===============");
        bus1.board(st1, st2);
        System.out.println("8===============");
        st1.collectPass();
        st2.setLocation("Mirpur");
        st1.showDetails();
        st2.showDetails();
        System.out.println("9===============");
        bus1.board(st1);
        bus1.board(st2, st3);
        System.out.println("10===============");
        bus1.showDetails();
    }
}




/*

- You may assume that to board a bus, a student must have the bus pass, 
    and his/her location must match the route of the bus.
- Additionally, the default maximum capacity of the bus is 2.
- The location attribute of the Student class will be private

1===============
Student Name: Afif
Lives in Mirpur
Have Bus Pass? false
Student Name: Shanto
Lives in Motijheel
Have Bus Pass? false
2===============
Student Name: Taskin
Lives in Mirpur
Have Bus Pass? false
3===============
Bus Route: Mirpur
Passenger Count: 0 (Max: 2)
Passengers on Board:
Bus Route: Azimpur
Passenger Count: 0 (Max: 5)
Passengers on Board:
4===============
5===============
Student Name: Shanto
Lives in Motijheel
Have Bus Pass? true
Student Name: Taskin
Lives in Mirpur
Have Bus Pass? true
6===============
No passengers
7===============
You don't have a bus pass!
You got on the wrong bus!
8===============
Student Name: Afif
Lives in Mirpur
Have Bus Pass? true
Student Name: Shanto
Lives in Mirpur
Have Bus Pass? true
9===============
Afif boarded the bus.
Shanto boarded the bus.
Bus is full!
10===============
Bus Route: Mirpur
Passenger Count: 2 (Max: 2)
Passengers on Board:
Afif Shanto

 */