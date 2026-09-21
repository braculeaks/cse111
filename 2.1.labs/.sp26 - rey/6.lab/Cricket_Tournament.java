public class Cricket_Tournament extends Tournament 
{
    int teams = 0;
    String type = "No Type";

    Cricket_Tournament(String n, int tN, String t) {
        super(n);
        teams = tN;
        type = t;
    }

    Cricket_Tournament() {
        this("Default", 0, "No Type");
    }

    String info() {
        String out = "";

        out += "Cricket " + super.getName() + "\n";
        out += "Number of Teams: " + teams + "\n";
        out += "Type: " + type;

        return out;
    }
}

class Tennis_Tournament extends Tournament 
{
    int players = 0;

    Tennis_Tournament(String n, int p) {
        super(n);
        players = p;
    }

    String info() {
        String out = "";

        out += "Tennis " + super.getName() + "\n";
        out += "Number of Players: " + players;

        return out;
    }
}