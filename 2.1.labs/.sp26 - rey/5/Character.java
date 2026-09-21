public class Character {                    /* a5q2 */
    static int c = 0;
    static int kids = 0;
    static int teens = 0;
    static int adults = 0;
    static float avg = 0;
    static float sum = 0;
    static Character strongest = null;

    static void printStats() {
        System.out.println("Total Characters: " + c);
        System.out.println("Kids: " + kids);
        System.out.println("Teens: " + teens);
        System.out.println("Adults: " + adults);
        System.out.println("Average Health: " + avg);
        System.out.println("Strongest Character: ");
        if (strongest != null) {
            strongest.fn1();
        }
    }

    String name;
    String group;
    int health;
    int ID;

    Character(String n, int h) {
        this(n, "Teen", h);
    }

    Character(String n, String g, int h) {
        name = n;
        group = g;
        health = h;
        c++;
        ID = c;

             if (g.equals("Kid"))    kids++;
        else if (g.equals("Teen"))   teens++;
        else if (g.equals("Adult")) adults++;

        sum += h;
        avg = sum / c;

        if (c == 1) {
            strongest = this;
        }
        else {
            if (strongest.health < this.health) {
                strongest = this;
            }
        }
    }

    void printDetails() {
        System.out.println("ID: " + ID + ", " + "Name: " + name);
        System.out.println("Group: " + group);
        System.out.println("Health: " + health);
    }

    void fn1() {
        System.out.println(name + " (Health " + health + ")");
    }
}
