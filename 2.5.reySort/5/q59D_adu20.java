public class q59D_adu20 {       // WIP
    public static void main(String[] args){
        Game g1 = new Game("Valorant", 100);
        Game g2 = new Game("GTA V", 200);
        Game g3 = new Game("FC 25", 300);
        Game g4 = new Game("MineCraft", 150);
        Game g5 = new Game("Overwatch", 70);
        System.out.println("1===========");
        System.out.println("User Count: " + DesktopUser.userCount);
        System.out.println("2===========");
        DesktopUser.displayInfo();
        System.out.println("3===========");
        DesktopUser user1 = new DesktopUser("Clark");
        System.out.println("4===========");
        DesktopUser user2 = new DesktopUser("Bruce");
        System.out.println("5===========");
        user2.installGame(g1);
        System.out.println("6===========");
        DesktopUser.displayInfo();
        System.out.println("7===========");
        user1.installGame(g2);
        user2.installGame(g3);
        user1.installGame(g4);
        user2.installGame(g5);
        System.out.println("8===========");
        DesktopUser.displayInfo();
        System.out.println("9===========");
        System.out.println("User Count: " + DesktopUser.userCount);
        System.out.println("10===========");
        DesktopUser user3 = new DesktopUser("Barry");
        System.out.println("11===========");
        System.out.println("User Count: " + DesktopUser.userCount);
    }
}



/*

1===========
User Count: 0
2===========
Desktop Info:
Storage: 512 GB
No games installed!
3===========
Clark(ID: 1) logged in!
4===========
Bruce(ID: 2) logged in!
5===========
Valorant installed successfully!
6===========
Desktop Info:
Storage: 412 GB
Games installed:
1. Valorant (100 GB) - Installed by: Bruce(ID: 2)
7===========
GTA V installed successfully!
Not enough storage!
MineCraft installed successfully!
Cannot install more than 3 games!
8===========
Desktop Info:
Storage: 62 GB
Games installed:
1. Valorant (100 GB) - Installed by: Bruce(ID: 2)
2. GTA V (200 GB) - Installed by: Clark(ID: 1)
3. MineCraft (150 GB) - Installed by: Clark(ID: 1)
9===========
User Count: 2
10===========
Barry(ID: 3) logged in!
11===========
User Count: 3

*/
