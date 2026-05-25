public class ShoppingTester {
    public static void main(String [] args)
    {
        ShoppingItem i1 = new ShoppingItem("Carrots", 79.99);
        ShoppingItem i2 = new ShoppingItem("Broccolis", 120.99);
        ShoppingItem i3 = new ShoppingItem("Water", 15);

        ShoppingCart c1 = new ShoppingCart(5);
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