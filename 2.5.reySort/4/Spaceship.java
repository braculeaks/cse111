public class Spaceship {    // q46
    String name;
    int capacity;
    int capLeft;
    Cargo e;
    String [] cargoEle = new String[100];
    int count = 0;
    int weight;

    Spaceship(String n, int c){
        name = n;
        capacity = c;
        capLeft = capacity;
    }    
    public void loadCargo(Cargo element){
        e = element;
        String eName = e.getName();
        int weight  = e.getWeight();

        if(weight > capLeft)
            System.out.println("Warning: Unable to load "+eName+" inside "+this.name+". Exceeds capacity by "+capLeft);
        else {
            cargoEle[count] = eName;
            count++;
            capLeft -= weight; 
            weight += weight;
        }
    }
    public void displayDetails(){
        System.out.println("Spaceship Name: "+name);
        System.out.println("Capacity: "+capacity);
        System.out.println("Current Cargo Weight: "+weight);
        System.out.print("Cargo: ");
        for(int i = 0; i < count; i++)
            System.out.print(cargoEle[i]+" ");
        System.err.println();
    }
}

// Problem asked these two variables to be private
class Cargo {
    private String name;
    private int weight;
    
    Cargo (String n, int c){
        name = n;
        weight = c;
    }

    String getName()   {return name;}
    int    getWeight() {return weight;}
}