public class Car extends Vehicle {          // a7q4
    // String model;
    // int price;
    // boolean status;
    String type = "Regular Car";
    String s1 = "available";
    int seats;

    static void markAsSold(Car c) {
        c.sold = true;
        c.s1 = "sold";
    }

    static Car[] arr = new Car[5];
    static int c = 0;
    static void showAllAvailableCars() {
        System.out.println("Total Car: " + c);
        System.out.println("Available Cars: ");
        for (int i = 0; i < c; i++) {
            if (arr[i].sold == false)
                System.out.println(arr[i].vehicleId + " : " + arr[i].model);
        }
    }
    static void showAllCars() {
        System.out.println("Total Car: " + c);
        for (int i = 0; i < c; i++) {
            System.out.println(arr[i].vehicleId + " : " + arr[i].model + " - " + arr[i].s1);
        }
    }

    Car(String m, int p, int s) {
        super(m, p);
        seats = s;
        vehicleId = "CAR00" + (c+1);
        System.out.println("Vehicle ID: " + vehicleId + " created");

        arr[c++] = this;
    }

    @Override
    public void vehicleDetail() {
        super.vehicleDetail();
        System.out.println("Type: " + type);
        System.out.println("Seats: " + seats);
    }
}



class ElectricCar extends Vehicle {
    int bat;
    String type = "Electric Vehicle";
    String s1 = "available";

    static void markAsSoldEV(ElectricCar ev) {
        ev.sold = true;
        ev.s1 = "sold";
    }

    static ElectricCar[] arr = new ElectricCar[5];
    static int c = 0;

    ElectricCar(String m, int p, int b) {
        super(m, p);
        bat = b;
        vehicleId = "EV00" + (c+1);
        System.out.println("Vehicle ID: " + vehicleId + " created");

        arr[c++] = this;
    }

    @Override
    public void vehicleDetail() {
        super.vehicleDetail();
        System.out.println("Type: " + type);
        System.out.println("Battery Capacity: " + bat + " kWh");
    }
}
