public class Tennis_Tournament extends Tournament 
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