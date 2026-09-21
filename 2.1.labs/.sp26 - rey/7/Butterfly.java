public class Butterfly extends Caterpillar {        // a7q1
    String food;
    int age;

    Butterfly(String f, int a) {
        super(f, a);
    }

    @Override
    public void transform() {
        System.out.println("Caterpillar transforms into Butterfly");
    }

    @Override
    public void eat(int amount) {
        energy -= 5;
        energy += amount*5;
        System.out.println("Butterfly lost energy while flying and absorbed nectar");
    }

    @Override
    public void showDetails() {
        System.out.println("Food: " + food);
        System.out.println("Age: " + age);
        System.out.println("Energy: " + energy + " joules");
    }
}

class Moth extends Caterpillar {
    String food;
    int age;

    Moth(String f, int a) {
        super(f, a);
    }

    @Override
    public void transform() {
        System.out.println("Caterpillar transforms into Moth");
    }

    @Override
    public void eat(int amount) {
        energy -= 2.5;
        energy += amount*2.5;
        System.out.println("Moth lost energy due to nocturnal activity");
    }

    @Override
    public void showDetails() {
        System.out.println("Food: " + food);
        System.out.println("Age: " + age);
        System.out.println("Energy: " + energy + " joules");
    }
}
