public class Cow extends Animal {       /* a6q1 */
    String name;
    String getName() {return name;}

    Cow() {
        System.out.println("The cow says hello!");
    }

    public void updateSound(String s) {
        super.sound = s;
    }
}