public class Character {
    static int total = 0;
    static int kids = 0;
    static int teens = 0;
    static int adults = 0;
    static double totalH = 0;
    static double avgH = 0;
    static String strong = "None";
    static int maxH = 0;
    static Character[] arr = new Character[100];

    // the lines above will be executed once in a lifetime.
    // that is exactly when the program start to run. because they are static

    static void printStats(){
        System.out.println("Total Characters: " + total);
        System.out.println("Kids: " + kids);
        System.out.println("Teens: " + teens);
        System.out.println("Adults: " + adults);
        System.out.println("Average Health: " + avgH);
        System.out.println("Strongest Character: " + strong + " (Health " + maxH + ")");
    }

    String name;
    String group;
    int health;
    int id;

    // these 4 lines above will be executed evertime 1 instance of an object gets created from this blueprint

    Character(String n, String grp, int h){
        name = n;
        group = grp;
        health = h;
        arr[total] = this;
        total++;
        id = total;
        checkGrp(grp);
        checkStro(this);
        updateAvgH(h);
    }
    Character(String n, int h){
        this(n , "Teen", h);
    }

    private void checkGrp(String g){
        if(g.equals("Kid")) kids++;
        if(g.equals("Teen")) teens++;
        if(g.equals("Adult")) adults++;
    }

    private void checkStro(Character c){
        if(c.health > maxH){
            strong = c.name;
            maxH = c.health;
        }

    }

    private void updateAvgH (int h){
        totalH += h;
        avgH = totalH / total;
    }

    void printDetails(){
        System.out.println("ID: " + id + ", Name: " + name);
        System.out.println("Group: " + group);
        System.out.println("Health: " + health);
    }
}
