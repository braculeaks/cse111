public class Taxi {             // q42
    String number;
    String route;

    Taxi(String n, String r){
        number = n;
        route =r;
    }
    public void compareTaxi(Taxi t){
        if (route.equals(t.route) == true)
            System.out.println("Both routes are the same!");
        else
            System.out.println("Routes are not the same!");
    }
}
