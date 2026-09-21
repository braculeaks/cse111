public class TaxiLagbe {
    String number;
    String area;
    int p;
    int p_max = 4;
    String[] passengers = new String[4];
    int total_income = 0;

    TaxiLagbe(String S1, String S2) {
        this.number = S1;
        this.area = S2;
        System.out.println("A new taxi has been created");
    }

    TaxiLagbe(String S1) {
        this(S1, "Khulna");
    }

    void printDetails() {
        System.out.println("Taxi number: "+number);
        System.out.println("This taxi can cover "+area+" area");
        System.out.println("Total Passenger: "+p);
        System.out.println("Passenger List:");
        for (int i = 0; i < p; i++) {
            System.out.print(passengers[i]+" ");
        }
        System.out.println();
        System.out.println("Total collected fare: "+total_income+" Taka");
    }

    void addPassenger(String name, int vara) {
        if (p >= p_max) {
            System.out.println("Taxi Full! No more passengers can be added");
        }
        else {
            passengers[p++] = name;
            total_income += vara;
            System.out.println("Dear "+name+"! Welcome to TaxiLagbe");
        }
    }

    void addPassenger(String name1, int vara1, String name2, int vara2) {
        addPassenger(name1, vara1);
        addPassenger(name2, vara2);
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
Taxi Full! No more passengers can be added
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