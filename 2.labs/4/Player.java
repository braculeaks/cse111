public class Player {       /* a4q2 */
    String name;
    int HP;
    String def[] = new String[5];
    int c = 0;

    public Player(String n, int h) {
        name = n;
        HP = h;

        System.out.println(n + " joined the game");
        System.out.println("HP: " + h);
    }

    public Player(String n) {
        this(n, 100);
    }

    public void viewInfo() {
        System.out.println("Player Name: " + name);
        System.out.println("Current HP: " + HP);

        if (c > 0) {
            System.out.println("Defeated: ");
            for (int i = 0; i < c; i++) {
                System.out.print(def[i] + ", ");
            }
            System.out.println();
        }
    }

    public void defeatVillain(String n, int h) {
        if (h <= HP) {
            HP += h;
            def[c++] = n;
            System.out.println("defeated " + n);
        }
        else {
            System.out.println("failed to defeat " + n);
        }
    }

    public void defeatVillain(int b, String n, int h) {
        this.HP *= b;
        System.out.println("HP with " + b + "x boost: " + this.HP);
        defeatVillain(n, h);
    }

    public void defeatVillain(Player v) {
        defeatVillain(v.name, v.HP);
    }
}
