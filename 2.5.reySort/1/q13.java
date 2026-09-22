public class q13 {
    public static void main(String args[]){
        Player player1 = new Player();
        player1.name = "Ronaldo";
        player1.jersy_number = 9;
        player1.position = "Striker";
        System.out.println("Name of the Player: "+ player1.name);
        System.out.println("Jersey Number of player: "+ player1.jersy_number);
        System.out.println("Position of player: "+ player1.position);
        System.out.println("=====================");
        Player player2 = new Player();
        player2.name = "Neuer";
        player2.jersy_number = 1;
        player2.position = "Goal Keeper";
        System.out.println("Name of the player: "+ player2.name);
        System.out.println("Jersey Number of player: "+ player2.jersy_number);
        System.out.println("Position of player: "+ player2.position);
    }
}


/*

KNI Task 4
# Design Player class

Name of the Player: Ronaldo
Jersey Number of player: 9
Position of player: Striker
=====================
Name of the player: Neuer
Jersey Number of player: 1
Position of player: Goal Keeper

 */