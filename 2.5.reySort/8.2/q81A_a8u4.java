public class q81A_a8u4 {     // RecyclingPlant
    public static void main(String[] args) {
        SorterBot robot = new SorterBot();
        UsedBattery bat1 = new UsedBattery("Duracell-X", true);
        PlasticBottle bot1 = new PlasticBottle("Coke-Zero", 500);
        Waste unknown = new Waste("Mystery-Box");
        System.out.println("#######################");
        robot.processItem(bat1);
        robot.processItem(bot1);
        robot.processItem(unknown);
        robot.processItem(new UsedBattery("Energizer", false));
    }
}

// Parent Class
class Waste {
    String id;
    
    Waste(String id) {
        this.id = id;
    }
}

// Disjoint Class
class SorterBot {
    public void processItem(Waste item) {
        //WRITE YOUR CODE HERE
        System.out.println("-------------------------------");
    }
}


/*

Write the UsedBattery and the PlasticBottle classes derived from Waste class so that the following code generates the output below.
You also need to complete the SorterBot class for this code to work. You cannot create any additional methods in the SorterBot class.


#######################
Scanning Item Duracell-X [Type: BATTERY]
Duracell-X is leaking. Sealing in concrete container.
-------------------------------
Scanning Item Coke-Zero [Type: PLASTIC]
Coke-Zero compressed from 500ml to flat disk.
-------------------------------
Scanning Item Mystery-Box [Type: UNKNOWN]
Item sent to generic incinerator.
-------------------------------
Scanning Item Energizer [Type: BATTERY]
Energizer stored in dry cell.
-------------------------------

 */