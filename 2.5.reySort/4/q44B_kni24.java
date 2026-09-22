public class q44B_kni24 {
    public static void main(String args []){
        Taxi2 t1 = new Taxi2("MX8190", "Gulshan");
        Passenger2 p1 = new Passenger2("Ali", 20);
        Passenger2 p2 = new Passenger2("Mifta", 45);
        Passenger2 p3 = new Passenger2("Marzan", 32);
        System.out.println("1------------");
        t1.showTaxi();
        System.out.println("2------------");
        p1.info();
        p2.info();
        System.out.println("3------------");
        t1.addPassenger(p1);
        t1.addPassenger(p2);
        t1.addPassenger(p3);
        System.out.println("4------------");
        t1.showTaxi();
    }
}


/*

1------------
Taxi No: MX8190
Route: Gulshan
Passenger List:
2------------
Name: Ali
Age: 20
Name: Mifta
Age: 45
3------------
4------------
Taxi No: MX8190
Route: Gulshan
Passenger List:
Ali 20
Mifta 45
Marzan 32

 */