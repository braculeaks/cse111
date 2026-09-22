public class q44A_rey1 {
    public static void main(String [] args)
    {
        Item i1 = new Item("Carrots", 79.99);
        Item i2 = new Item("Broccolis", 120.99);
        Item i3 = new Item("Water", 15);

        ShoppingCart c1 = new ShoppingCart(5);  // PascalCase
        c1.addItem(i1);
        c1.addItem(i2); 
        c1.addItem(i3); 
        
        System.out.println("1. ================");
        c1.cartDetails();
    }
}

/*

1. ================
Items in my cart: 
0. Carrots: 79.99
1. Broccolis: 120.99
2. Water: 15.0

 */