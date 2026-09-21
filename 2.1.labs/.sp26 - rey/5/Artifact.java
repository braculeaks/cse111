public class Artifact                       /* a5q3 */
{
    static Artifact ins[] = new Artifact[4];
    static int c = 0;

    private String owner;
    private String device;
    private int power;

    Artifact(String d)           { this(d, "Okabe"); }
    Artifact(String d, String n) {
        owner = n;
        device = d;
        power = CalcPower();
    }

    String  GetName() {return device;}
    void changeName(String d) {
        device = d;
        power = CalcPower();
        System.out.println("Name changed and power recalculated.");
    }

    int CalcPower() {
        String d = this.device;
        int p = 0;
  
        int i = 0;
        int lim = d.length();
        if (lim % 2 == 0) {i = 0;}
        else              {i = 1;}

        for (; i < lim; i += 2) {
            p += (int) d.charAt(i);
        }
        
        return p;
    }

    void revealArtifact() {
        System.out.println(device + " added by " + owner + " has power of " + power);
    }





    static void AddtoVault(Artifact a) {
        if (c < 4) {
            System.out.println(       a.owner + " added " + a.device + " successfully to the vault.");
            ins[c++] = a;
        }
        else {
            System.out.println("!!" + a.owner + " unsuccessful in adding artifact to the vault!!");
        }
    }

    static void labReport() {
        System.out.println("=== Future Gadget Lab ===");
        for (int i = 0; i < c; i++) {
            ins[i].revealArtifact();
        }
    }

    static String strongest() {
        Artifact max_p = ins[0];

        for (int i = 0; i < c; i++) {
            if (max_p.power < ins[i].power) {
                max_p = ins[i];
            }
        }

        return max_p.device;
    }
}