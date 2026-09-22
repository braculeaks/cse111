public class Bakery         // q38
{
    String bName;
    int capacity;
    String[] items;
    int [] pieces;
    int count = 0;

    Bakery(String name, int c) {
        bName = name;
        capacity = c;
        items = new String[capacity];
        pieces = new int[capacity];
    }
    Bakery(String n) {
        this(n, 7);
    }
    public void addItems(String item, int n){
        if(capacity <= count)  {
            System.out.println("No more products can be added!");
            return;
        }
        items[count] = item;
        pieces[count] = n;
        count++;
        System.out.println(n + " " + item + " are added.");
    }
    public void details(){
        System.out.println("Bakery Name: "+ bName);
        System.out.println("Product Capacity: "+capacity);
        System.out.println("Product Info:");
        for(int i = 0; i < count; i++){
            System.out.println((i+1)+") " +items[i]+": "+pieces[i]+" pieces");
        }
    }
    public int find(String item) {
        for (int i = 0; i < count; i++) {
            if(items[i].equals(item) == true) {
                return i;
            }
        }
        return -1;
    }
    public void sellItems(String item, int  n){
        int k = find(item);
        if (k == -1) {
            System.out.println("Item not found.");
        }
        else {
            if(pieces[k] < n) 
                System.out.println("Sorry! " + n + " Muffins are not available.");
            else {
                System.out.println(n + " " + items[k] + " are sold.");
                pieces[k] -= n;
            }
        }
    }
}
