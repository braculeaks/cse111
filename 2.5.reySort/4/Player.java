public class Player {       // q43
    String name;
    int hp; 
    int count = 0;
    String [] defeated = new String[5];

    Player (String n, int h) {
        name = n;
        hp = h;
            System.out.println(name + " joined the game");
            System.out.println("HP: " + hp);
    }
    Player (String n){
        this(n, 100);
    }


    // Method OverLoading
    public void defeatVillain(String n, int h){
        if (hp >= h){
            System.out.println("defeated "+n);
            hp += h;
            defeated[count] = n;
            count++;  
        }
        else
            System.out.println("failed to defeat "+n);
    }

    public void defeatVillain(char b, String n, int h){
        int boost = b - '0';
        this.hp *= boost;
        System.out.println("HP with "+ boost + "x boost: " + hp);

        defeatVillain(n, h);
    }

    // ReUsing superior ones
    public void defeatVillain(Player p){
        defeatVillain(p.name, p.hp);
    }




    public void viewInfo(){
        System.out.println("Player name: " + name);
        System.out.println("Current HP: " + hp);
        if (count > 0) {
            System.out.println("Defeated:");
            for(int i = 0; i < count; i++){
                System.out.print(defeated[i] + ", ");
            }
            System.out.println();
        }
    }
}
