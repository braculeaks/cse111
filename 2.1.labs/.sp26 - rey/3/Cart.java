public class Cart {                         /* a3q2 */
    public int id;
    public double total = 0.0;
    public double discount = 0.0;
    public double total_discounted = 0.0;

    public int e = 0;
    public int e_max = 3;
    public String[]  items = new String[3];
    public double[] prices = new double[3];

    void create_cart(int x) {
        this.id = x;
    }

    void giveDiscount(double d) {
        this.discount = d;
    }

    void addItem(double price, String S) {
        addItem(S, price);
    }

    void addItem(String S, double price) {
        if (e >= e_max) {
            System.out.println("You already have 3 items on your cart");       
        }
        else {
            items[e] = S;
            prices[e] = price;
            e++;
            total += price;

            System.out.println(S+" added to cart "+id);
            System.out.println("You have "+e+" item(s) in your cart now");
        }
    }

    void cartDetails() {
        System.out.println("Your cart(c"+id+") :");
        for (int i = 0; i < e; i++) {
            System.out.println(items[i]+" - "+prices[i]);
        }

        this.total_discounted = total - (total*(discount/100));

        System.out.println("Discount Applied: "+discount+"%");
        System.out.println("Total price: "+total_discounted);
    }
}