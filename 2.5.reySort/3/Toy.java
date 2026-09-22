public class Toy            // q35
{
    String name; 
    int price;

    Toy(String t, int p){
        name = t;
        price = p;
        System.out.println("A new toy has been made!");
    }
    public void updateName(String n){
        System.out.println("Changing the old name: "+ name);
        name = n;
        System.out.println("new name: " + n);
    }
    public void updatePrice(int p){
        price = p;
    }
    public void showPrice(){
        System.out.println("price: "+price+" Taka");
    }
}