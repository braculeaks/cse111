abstract class SpaceProbe {
    public String model;

    public SpaceProbe(String model) {
        this.model = model;
    }

    // This acts like an "Abstract Variable"
    // It forces subclasses to "return" a specific value.
    public abstract double getTargetPressure();

    public void statusReport() {
        System.out.println("Probe: " + model);
        // The parent uses the "abstract variable" logic here
        System.out.println("Expected Pressure: " + getTargetPressure() + " bar");
        System.out.println("Deployment: Ready");
    }
}

public class q91_rey2 {
    public static void main(String[] args) {
        MarsProbe m = new MarsProbe("Pathfinder");
        VenusProbe v = new VenusProbe("Venera");

        m.statusReport();
        System.out.println("--------------------");
        v.statusReport();
    }
}


/*

MarsProbe: Must return a pressure of 0.006
VenusProbe: Must return a pressure of 92.0

Probe: Pathfinder
Expected Pressure: 0.006 bar
Deployment: Ready
--------------------
Probe: Venera
Expected Pressure: 92.0 bar
Deployment: Ready

 */