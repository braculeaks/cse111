public class Guild {
    String name;
    int count = 0;
    Hero [] heroes = new Hero[4];       // can't access heroes[4]
        // Guild "has-a" relationship with Hero

    Guild(String n){
        name = n;
    }

    public void addHero(Hero h){
        if(count >= 4){
            System.out.println("Slot full! Cannot add.");
            return;
        }
        else {
            for(int i = 0; i < count; i++){
                if (heroes[i] == h){
                    System.out.println("Hero already exists! Cannot add.");
                    return;
                }
            }
        }
        heroes[count] = h;
        count++;
    }

    public int find(String heroName) {
        int k = -1;
        for (int i = 0; i < count; i++) {
            if(heroName.equals(heroes[i].getName())){
                return i;
            }
        }
        return k;
    }

    public void removeShift(int idx) {          // remove & shift
        for(int j = idx+1; j < count; j++){
            heroes[j-1] = heroes[j];
        }
        this.count--;
    } 

    public void requestTransfer(Guild target, String heroName){
        for(int i = 0; i < count; i++){
            if(heroName.equals(heroes[i].getName())){
                if(target.count < 4){
                    if(heroes[i].getLevel() >= 10){
                        target.heroes[target.count] = heroes[i];
                        System.out.println(heroName + " successfully transferred to " + target.name);
                        target.count++;

                        for(int j = i; j < count; j++){
                            heroes[j] = heroes[j+1];
                        }
                        this.count--;
                        return;
                    }
                    else if(heroes[i].getLevel() < 10){
                        System.out.println("Transfer Failed: " + heroName + "'s level is below 10");
                        return;
                    }
                }
                else {
                    System.out.println("Transfer Failed: " + target.name + " does not have an empty slot");
                    return;
                }
            }
        }
        System.out.println("Transfer Failed: " + heroName + " not found in " + name);
        return;
    }

    public void showDetails(){
        System.out.println("Guild: "+name);
        System.out.println("Heroes: "+count+"/4");
        for(int i = 0; i < count; i++){
            System.out.println((i+1) + ". " + heroes[i].getDetails());
        }
    }
}
