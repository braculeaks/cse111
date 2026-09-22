interface Payable {
    int x = 10;             // under the hood,     public static final int x = 10;
    public double pay();
                            // also, interface cannot have CONSTRUCTOR
}

class TutorShift implements Payable {
    public int hours;

    public TutorShift(int hours) {
        this.hours = hours;
    }

    public double pay() {
        return hours * 500;
    }
}


public class q80N {
    public static void main(String[] args) {
        Payable p = new TutorShift(3);
        System.out.println(p.pay());        // 1500.0

        TutorShift obj1 = new TutorShift(3);
        TutorShift obj2 = new TutorShift(3);

        System.out.println(obj1.x);     // they refer to the same static x in memory
        System.out.println(obj2.x);     // they refer to the same static x in memory
    }
}



/*

Introducing: Interface = Abstract + no instance variables / fields + no Constructor

Abstract
    1. you can't instantiate objects from it

Interface
    1. you can't instantiate objects from it
    2. instance variables not allowed
    3. interface can't have CONSTRUCTOR

*/