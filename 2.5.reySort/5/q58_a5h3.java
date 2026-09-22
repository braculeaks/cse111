public class q58_a5h3 {         // Kora Hoy Nai
    public static void main(String[] args) {
        Artifact a = new Artifact("Phone Microwave", "Kurisu");
        System.out.println("--------1-------");
        Artifact.AddtoVault(a);
        Artifact.AddtoVault(new Artifact("D-Mail Capsule", "Mayuri"));
        System.out.println("--------2-------");
        Artifact c = new Artifact("C204 Chip");
        Artifact d = new Artifact("Divergence Meter"); 
        Artifact e = new Artifact("M4A2 Robot", "Okabe");
        Artifact.AddtoVault(c);
        Artifact.AddtoVault(d);
        Artifact.AddtoVault(e);
        System.out.println("--------3-------");
        Artifact.labReport();
        System.out.println("--------4-------");
        System.out.println("Power of "+c.GetName()+" is "+c.CalcPower());
        System.out.println("--------5-------");
        System.out.println("Strongest Artifact: "+Artifact.strongest());
        System.out.println("--------6-------");
        a.revealArtifact();
        System.out.println("--------7-------");
        a.changeName("Banana Microwave");
        System.out.println("--------8-------");
        Artifact.labReport();
        System.out.println("--------9-------");
        System.out.println("Strongest Artifact: "+Artifact.strongest());
    }
  }
  

/*

- All attributes of Artifact class are private.
- Vault can store max 4 artifacts
- Power Calculation
    - Even Length name ==> sum(ascii-values of chars in even index of name) [starting from indices: 0, 2, 4...]
    -  Odd Length name ==> sum(ascii-values of chars in  odd index of name) [starting from indices: 1, 3, 5...]

--------1-------
Kurisu added Phone Microwave successfully to the vault.
Mayuri added D-Mail Capsule successfully to the vault.
--------2-------
Okabe added C204 Chip successfully to the vault.
Okabe added Divergence Meter successfully to the vault.
!!Okabeunsuccessful in adding artifact to the vault!!
--------3-------
=== Future Gadget Lab ===
Phone Microwave added by Kurisu has power of 702
D-Mail Capsule added by Mayuri has power of 602
C204 Chip added by Okabe has power of 274
Divergence Meter added by Okabe has power of 734
--------4-------
Power of C204 Chip is 274
--------5-------
Strongest Artifact: Divergence Meter
--------6-------
Phone Microwave added by Kurisu has power of 702
--------7-------
Name changed and power recalculated.
--------8-------
=== Future Gadget Lab ===
Banana Microwave added by Kurisu has power of 774
D-Mail Capsule added by Mayuri has power of 602
C204 Chip added by Okabe has power of 274
Divergence Meter added by Okabe has power of 734
--------9-------
Strongest Artifact: Banana Microwave


*/