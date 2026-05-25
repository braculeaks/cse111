public class Spaceship {                /* a4q4 */
    String name;
    String cargo;
    int cap;
    int current_weight;

    Cargo arr[] = new Cargo[100];
    int c = 0;

    public Spaceship(String n, int c) {
        name = n;
        cap = c;
    }

    public void loadCargo(Cargo car) {
        arr[c++] = car;
        current_weight += car.weight;
    }

    public void displayDetails() {
        System.out.println("Spaceship Name: " + name);
        System.out.println("Capacity: " + cap);
        System.out.println("Current Cargo Weight: " + current_weight);
        System.out.print("Cargo:");
        for (int i = 0; i < c; i++) {
            System.out.print(arr[i].name + " ");
        }
        System.out.println();
    }
}

class Cargo {
    String name;
    int weight;

    public Cargo(String n, int w) {
        name = n;
        weight  = w;
    }
}