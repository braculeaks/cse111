public class Game {
    String name;
    int space;
    int sLeft;
    DesktopUser animal = null;

    Game (String n, int s){
        name = n;
        space = s;
    }

    void fn1(int i) {
        System.out.println((i+1) + ". " + name + " (" + space + " GB) - Installed by: " + animal.name + "(ID: " + animal.id + ")");
    }
} 

class DesktopUser {
    static int userCount = 0;
    static int storage = 512;
    static int gameCount = 0;
    static Game[] games = new Game[3];
    static int maxGames = 3;
    
    String name;        // gets created when 1 instance is created
    int id;             // same

    static void resize(int newSize) {
        Game [] games2 = new Game[newSize];
        for(int i = 0; i < gameCount; i++)
        {
            games2[i] = games[i];
        }
        maxGames = newSize;
    }


    DesktopUser(String n){
        name = n;
        userCount++;
        id = userCount;
        System.out.println(name + "(ID: "+id+") logged in!");
    }

    public void installGame(Game g){
        if (gameCount >= maxGames)
            System.out.println("Cannot install more than 3 games!");
        else if (storage < g.space)
            System.out.println("Not enough storage!");
        else {
            games[gameCount] = g;
            gameCount++;
            System.out.println(g.name + " installed successfully!");
            g.animal = this;
            storage -= g.space;
        }
    }

    public static void displayInfo(){
        System.out.println("Desktop Info: ");
        System.out.println("Storage: " + storage + " GB");
        if (gameCount == 0) {
            System.out.println("No games installed!");
            return;
        }
        System.out.println("Games installed:");
        for (int i = 0; i < gameCount; i++)
            games[i].fn1(i);
    }
}