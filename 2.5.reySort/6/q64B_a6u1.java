public class q64B_a6u1 {
    public static void main(String[] args) {
        Player playerOne = new Player("Al-Nassr", "Ronaldo", "Striker", 25, 32);
        playerOne.calculateRatio();
        playerOne.printDetails();
        System.out.println("----------------");
        Manager managerOne = new Manager("Real Madrid", "Zidane", "Manager", 25);
        managerOne.printDetails();
    }
}

class SportsPerson {
    private String team;
    private String name;
    public String role;
    public double earningPerMatch;
    
    public SportsPerson(String teamName, String name, String role) {
        this.team = teamName;
        this.name = name;
        this.role = role;
        this.earningPerMatch = 0;
    }

    public String getNameTeam() {
        return "Name: " + name + ", Team Name: " + team;
    }
}

class Player extends SportsPerson {
    int goal;
    int matches;
    double ratio;

    Player(String teamName, String name, String role, int goal, int matches){
        super(teamName, name, role);
        super.earningPerMatch = (goal * 1000) + (matches * 10);
        this.goal = goal;
        this.matches = matches;
        this.ratio = 0.0;
    }


    public void calculateRatio() {
        ratio = (double)goal/matches;
    }

    public void printDetails() {
        System.out.println(getNameTeam());
        System.out.println("Team Role: "+role);
        System.out.println("Total Goal: "+goal+", Total played: "+matches);
        System.out.println("Goal Ratio: "+ratio);
        System.out.println("Match Earning: "+earningPerMatch);
    }
}

class Manager extends SportsPerson {
    int wins;

    Manager(String teamName, String name, String role, int wins){
        super(teamName, name, role);
        super.earningPerMatch = wins *1000;
        this.wins = wins;

    }

    public void printDetails() {
        System.out.println(getNameTeam());
        System.out.println("Team Role: "+role);
        System.out.println("Total win: "+wins);
        System.out.println("Match Earning: "+earningPerMatch);
    }
}


/*

Exercise

To calculate the match earnings use the following formula:
- Player: (total_goal * 1000) + (total_match * 10)
- Manager: match_win * 1000

Name: Ronaldo, Team Name: Al-Nassr
Team Role: Striker
Total Goal: 25, Total Played: 32
Goal Ratio: 0.78
Match Earning: 25320K
----------------
Name: Zidane, Team Name: Real Madrid
Team Role: Manager
Total Win: 25
Match Earning: 25000K

 */