public class q73_a7c3 {
    public static void main(String[] args) {
        Ride r1 = new Ride(7);
        PremiumRide r2 = new PremiumRide(15, true);
        PremiumRide r3 = new PremiumRide(12, false);
        System.out.println("1============");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println("2============");
        System.out.println("Regular Ride: "+r1.calculateFare()+" TK");
        System.out.println("Premium Ride "+r2.getId()+":"+r2.calculateFare()+" TK");
        System.out.println("Premium Ride "+r3.getId()+":"+r3.calculateFare(40)+" TK");
        System.out.println("3============");
        System.out.println(r3);
    }
}

public class Ride {
    private int distance;
    public Ride(int distance) {`
        this.distance = distance;
    }
    public double calculateFare() {
        return distance * 10;
    }
    public double getDistance() {
        return distance;
    }
    public String toString(){
        return "Distance: "+this.distance+" km";
    }
}


/*

Design the PremiumRide derived from Ride class to generate the given output.
fare += (fare * 20) / 100.0
An extra 20% charge is applied to the total fare if surge is active(true).
If calculateFare(int amount) is called, the fare is discounted with the
amount.

1============
Distance: 7 km
Distance: 15 km
ID: 1-15
Service Charge: 50 TK
Surge: true
Discount: false
Distance: 12 km
ID: 2-12
Service Charge: 50 TK
Surge: false
Discount: false
2============
Regular Ride: 70.0 TK
Premium Ride 1-15: 240.0 TK
Premium Ride 2-12: 130.0 TK
3============
Distance: 12 km
ID: 2-12
Service Charge: 50 TK
Surge: false
Discount: true

 */