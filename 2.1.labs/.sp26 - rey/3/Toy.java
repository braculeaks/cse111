public class Toy {                  /* a3q1 */
    public String name;
    public int price;

    Toy(String S, int p) {
        this.name = S;
        this.price = p;

        System.out.println("A new toy has been made!");
    }

    void updatePrice(int p)     {this.price = p;}
    void updateName(String S)   {
        System.out.println("Changing old name: " + this.name);
        this.name  = S;
        System.out.println("new name: " + this.name);
    }

    void showPrice() {
        System.out.println("price: " + this.price + " Taka");
    }
}