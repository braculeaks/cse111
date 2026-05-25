public class a8c1 {
    public static void main(String[] args){
        Pokemon pikachu = new Pokemon("Pikachu");
        pikachu.attack();
        pikachu.attack("Thunderbolt");
        pikachu.attack("Iron Tail", 90); 
    }
}


/*

Bonus Question: What type of polymorphism is depicted in the code above?

Pikachu attacks with a basic move!
Pikachu uses Thunderbolt!
Pokemon uses Iron Tail with power 90!

 */