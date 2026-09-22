interface Payable {
    int hours = 10;         // under the hood,     public static final int hours = 10;
    public double pay();
}

class TutorShift implements Payable {
    public TutorShift(int hours) {
        this.hours = hours;             // causes error now
    }

    public double pay() {
        return hours * 500;
    }
}


public class q80O {
    public static void main(String[] args) {
        Payable p = new TutorShift(3);
        System.out.println(p.pay());        // 1500.0
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