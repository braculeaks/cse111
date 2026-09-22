public class q57_a5c3 {     // Kora Hoy Nai
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", 65.0);
        Pokemon caterpie = new Pokemon("Caterpie", 45.0);
        Pokemon squirtle = new Pokemon("Squirtle", 70.0);
        Pokemon eevee = new Pokemon("Eevee", 60.0);
        System.out.println("1---------------------");
        Trainer ash = new Trainer("Ash");
        System.out.println("2---------------------");
        ash.catchPokemon(pikachu);
        System.out.println("3---------------------");
        ash.catchPokemon(caterpie);
        ash.catchPokemon(squirtle);
        System.out.println("4---------------------");
        ash.viewPokeDex();
        System.out.println("5---------------------");
        Trainer gary = new Trainer("Gary");
        System.out.println("6---------------------");
        gary.catchPokemon(squirtle);
        gary.catchPokemon(eevee);
        System.out.println("7---------------------");
        gary.viewPokeDex();
        System.out.println("8---------------------");
        Trainer.battle(ash, gary);
    }
}


class Pokemon {
    private String name;
    private double hp;
    public Pokemon(String n, double hp) {
        this.name = n;
        this.hp = hp;
    }
    public String getName() {
        return name;
    }
    public double getHP() {
        return hp;
    }
}

/*

- YOU CANNOT change the given Pokemon class.
- Each Trainer can catch at max 7 pokemons.

1---------------------
Trainer ID: 1, Name: Ash - created
2---------------------
Ash caught: Pikachu
3---------------------
Ash caught: Caterpie
Ash caught: Squirtle
4---------------------
Ash's Trainer code: T1
Pikachu: 65.0 points
Caterpie: 45.0 points
Squirtle: 70.0 points
Average of HP: 60.0
5---------------------
Trainer ID: 2, Name: Gary - created
6---------------------
Gary caught: Squirtle
Gary caught: Eevee
7---------------------
Gary's Trainer code: T2
Squirtle: 70.0 points
Eevee: 60.0 points
Average of HP: 65.0
8---------------------
Battle Info:
Ash's HP average: 60.0
Gary's HP average: 65.0
Gary wins

 */