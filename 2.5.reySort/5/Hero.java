public class Hero {
    
    private String name;
    private int level;
    private int hp =100;

    Hero (String name, int level){
        this.name =  name;
        this.level = level;
    }
    public String getName(){return name;}
    public int getLevel(){return level;}
    public int getHealth(){return hp;}
    public String getDetails(){return name + "(Level: " + level + ", HP: " + hp + ")";}
}
