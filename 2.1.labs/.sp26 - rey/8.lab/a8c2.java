class Fruit {
    private boolean formalin = false;
    private String name = "";
    public Fruit(boolean formalin, String name){
        this.formalin = formalin;
        this.name = name; 
    }   
    public String getName(){
        return name;
    }
    public boolean hasFormalin(){
        return formalin;
    }
}


public class a8c2 { 
    public static void testFruit(Fruit f) {
        System.out.println("----Printing Detail-----");
        if(f.hasFormalin()) {   
            System.out.println("Do not eat the "+f.getName()+".");
            System.out.println(f);
        } else {
            System.out.println("Eat the "+f.getName()+".");
            System.out.println(f);
        }
    } 
    public static void main(String [] args) {
        Mango m = new Mango();
        testFruit(m);
        Jackfruit j = new Jackfruit();
        testFruit(j);
    }
}


/*

----Printing Detail-----
Do not eat the Mango.
Mangos are bad for you
----Printing Detail-----
Eat the Jackfruit.
Jackfruits are good for you

 */
