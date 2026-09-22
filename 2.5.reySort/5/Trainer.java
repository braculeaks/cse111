public class Trainer {
    static int total = 0;

    static void battle(Trainer t1, Trainer t2){
        System.out.println("Battle Info:");
        System.out.println(t1.name+"'s HP average: "+t1.avgH);
        System.out.println(t2.name+"'s HP average: "+t2.avgH);

        if(t1.avgH > t2.avgH)
            System.out.println(t1.name+" wins");
        else if(t1.avgH < t2.avgH)
            System.out.println(t2.name+" wins");
        else System.out.println("Draw");
    }

    String name;
    Pokemon [] caught = new Pokemon[7];
    int id;
    int c =0;
    double totalH = 0;
    double avgH = 0;

    Trainer(String n){
        name = n;
        total++;
        id = total;
        System.out.println("Trainer ID: "+id+", Name: "+name+" - created");
    }

    void catchPokemon(Pokemon p){
        if(c >= 7) return;
        caught[c] = p;
        c++;
        System.out.println(name + " caught: " + p.getName());
        updateAvgH(p.getHP());
    }

    private void updateAvgH(double h){
        totalH += h;
        avgH = totalH / c;
    }

    void viewPokeDex(){
        System.out.println(name+"'s Trainer code: T"+id);
        for(int i = 0; i < c; i++){
            String n = caught[i].getName();
            double p = caught[i].getHP();
            System.out.println(n+": "+p+" points");
        }
        System.out.println("Average of HP: "+avgH);
    }
}
