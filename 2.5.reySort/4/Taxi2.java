public class Taxi2 {        // q44B
    String number;
    String route;

    Passenger2[] arr = new Passenger2[5];
    int c = 0;

    Taxi2(String n, String r){
        number = n;
        route = r;
    }

    public void showTaxi() {
        System.out.println("Taxi No: " + number);
        System.out.println("Route: " + route);
        System.out.println("Passenger List: ");
        for (int i = 0; i < c; i++) 
        {
            Passenger2 k = arr[i];
            k.fn1();
        }
    }

    public void addPassenger(Passenger2 p) {
        if (c >= 5) {
            System.out.println("not enough space");
            return;
        }
        this.arr[c] = p;
        c++;
    }
}

/* JAVA Says: 1 "class/blueprint" can be public per file */
class Passenger2 {
    String name;
    int age;

    Passenger2(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public void info() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public void fn1() {
        System.out.println(this.name + " " + this.age);
    }
}
