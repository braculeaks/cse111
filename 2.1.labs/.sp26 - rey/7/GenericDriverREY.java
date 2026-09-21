public class GenericDriverREY extends GenericDriver {       // a7q3
    String profile;
    boolean isPreme = true;

    GenericDriverREY(String n) {super(n);}

    @Override
    public String toString() {
        return super.getName() + "'s driver profile is " + profile;
    }

    @Override
    public String acceptRide(boolean hasVehicle) {
        return super.acceptRide(hasVehicle) + "\n" + this.toString();
    }

    @Override
    public void hasSafetyTraining() {
        super.hasSafetyTraining();
        if (isPreme == true) 
            System.out.println("Premium drivers receive extra safety briefings.");
    }

    void fightRestriction(String[] arr, String[] restricts, int c) {
        for (int i = 0; i < arr.length; i++) {
            boolean canEnter = true;
            for (int k = 0; k < c; k++) {
                if (arr[i].equals(restricts[k])) {
                    System.out.println(super.getName() + " cannot enter " + arr[i]);
                    canEnter = false;
                    break;
                }
            }
            if (canEnter == true) System.out.println(super.getName() + " can enter " + arr[i]);
        }
    }
}




class BikeDriver extends GenericDriverREY 
{
    static String[] restrictedAreas = new String[3];
    static int c = 0;
    static void restrictedAreas(String a) {
        restrictedAreas[c++] = a;
    }

    void fightRestriction(String[] arr) {
        super.fightRestriction(arr, BikeDriver.restrictedAreas, c);
    }

    BikeDriver(String n, String p) {
        super(n);
        profile = p;

        if (p.equals("Not Premium")) isPreme = false;
    }
}

class CarDriver extends GenericDriverREY 
{
    static String[] restrictedAreas = new String[2];
    static int c = 0;
    static void restrictedAreas(String a) {
        restrictedAreas[c++] = a;
    }

    void fightRestriction(String[] arr) {
        super.fightRestriction(arr, CarDriver.restrictedAreas, c);
    }

    CarDriver(String n, String p) {
        super(n);
        profile = p;

        if (p.equals("Not Premium")) isPreme = false;
    }

    CarDriver(String n) {
        super(n);
        profile = "Premium";
    }
}