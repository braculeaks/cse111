public class BracuStudent {
    public String name;
    private String loc;
    public boolean hasPass;

    public BracuStudent(String n, String l) {
        this.name = n;
        this.loc = l;
    }

    public void showDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Lives in " + loc);
        System.out.println("Have Buss Pass? " + hasPass);
    }

    public void collectPass()           {this.hasPass = true;}
    public void setLocation(String l)   {loc = l;}
    public String getLocation()  {return loc;}
}


class BracuBus {
    public String route;
    public int people = 0;
    public int max = 2;
    public BracuStudent[] arr = new BracuStudent[2];

    public BracuBus(String r, int m) {
        route = r;
        max = m;
        arr = new BracuStudent[m];
    }
    public BracuBus(String r) {this(r, 2);}

    public void showDetails() {
        System.out.println("Bus Route: " + route);
        System.out.println("Passenger Count: " + people + " (Max: " + max + ")");
        System.out.println("Passengers on Board:");
            if (people > 0) {
                for (int i = 0; i < people; i++) {
                    System.out.print(arr[i].name + " ");
                }
                System.out.println("");
            }
    }

    public void board() {
        System.out.println("No passengers");
    }
    public void board(BracuStudent s1, BracuStudent s2) {
        board(s1);
        board(s2);
    }
    public void board(BracuStudent s) 
    {
        if (s.hasPass == false) {
            System.out.println("You don't have a bus pass!");
            return;
        }

        if (s.getLocation().equals(this.route) == false) {
            System.out.println("You got on the wrong bus!");
            return;
        }

        if (people >= max) {
            System.out.println("Bus is full!");
            return;
        }

        arr[people] = s;    people++;
        System.out.println(s.name + " boarded the bus.");
    }
}