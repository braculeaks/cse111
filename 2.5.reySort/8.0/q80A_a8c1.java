public class q80A_a8c1 {
    public static void main(String[] args){
        Pokemon pikachu = new Pokemon("Pikachu");
        pikachu.attack();
        pikachu.attack("Thunderbolt");          // Method OverLoading
        pikachu.attack("Iron Tail", 90);
    }
}


class Pokemon {
    String name;

    Pokemon(String n){
        name = n;
    }

    void attack() {
        System.out.println(name + " attacks with a basic move!");
    }
    void attack(String n) {
        System.out.println(name + " uses " + n + "!");
    }
    void attack(String n, int p) {
        System.out.println(name + " uses " + n + " with power " + p + "!");
    }
}


/*

There are 2 typed of Polymorphism
    1. Compile-time
    2. Run-time

Bonus Question: What type of polymorphism is depicted in the code above?

Pikachu attacks with a basic move!
Pikachu uses Thunderbolt!
Pokemon uses Iron Tail with power 90!

 */