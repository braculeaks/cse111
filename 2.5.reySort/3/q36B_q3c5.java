public class q36B_q3c5 {        // Kora Hoy Nai
    public static void main(String[] args) {
        TaxiLagbe taxi1 = new TaxiLagbe("1010-01","Dhaka");
        System.out.println("1-------------");
        taxi1.printDetails();
        System.out.println("2-------------");
        taxi1.addPassenger("Wilson", 105);
        System.out.println("3-------------");
        taxi1.printDetails();
        System.out.println("4-------------");
        taxi1.addPassenger("Walker", 100, "Wood", 200);
        System.out.println("5-------------");
        taxi1.printDetails();
        System.out.println("6-------------");
        taxi1.addPassenger("Karen", 200);
        taxi1.addPassenger("Donald", 130);
        System.out.println("7-------------");
        taxi1.printDetails();
        System.out.println("8-------------");
        TaxiLagbe taxi2 = new TaxiLagbe("1010-02");
        System.out.println("9-------------");
        taxi2.addPassenger("Don", 115, "Parker", 215);
        System.out.println("10-------------");
        taxi2.printDetails();
    }
}


/*

A new taxi has been created
1-------------
Taxi number: 1010-01
This taxi can cover Dhaka area
Total Passenger: 0
Passenger List:
Total collected fare: 0 Taka
2-------------
Dear Wilson! Welcome to TaxiLagbe
3-------------
Taxi number: 1010-01
This taxi can cover Dhaka area
Total Passenger: 1
Passenger List:
Wilson
Total collected fare: 105 Taka
4-------------
Dear Walker! Welcome to TaxiLagbe
Dear Wood! Welcome to TaxiLagbe
5-------------
Taxi number: 1010-01
This taxi can cover Dhaka area
Total Passenger: 3
Passenger List:
Wilson Walker Wood
Total collected fare: 405 Taka
6-------------
Dear Karen! Welcome to TaxiLagbe
Taxi Full! No more passengers can be
added
7-------------
Taxi number: 1010-01
This taxi can cover Dhaka area
Total Passenger: 4
Passenger List:
Wilson Walker Wood Karen
Total collected fare: 605 Taka
8-------------
A new taxi has been created
9-------------
Dear Don! Welcome to TaxiLagbe
Dear Parker! Welcome to TaxiLagbe
10-------------
Taxi number: 1010-02
This taxi can cover Khulna area
Total Passenger: 2
Passenger List:
Don Parker
Total collected fare: 330 Taka

 */