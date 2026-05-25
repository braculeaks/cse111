public class ShoppingItem {
    String name;
    double price;

    public ShoppingItem(String n, double p)
    {
        name = n;
        price = p;
    }
}

class ShoppingCart {
    ShoppingItem[] items = new ShoppingItem[5];
    int c = 0;

    ShoppingCart(int x) {
        items = new ShoppingItem[x];
    }

    public void addItem(ShoppingItem obj) {
        if(c < items.length) {
            items[c++] = obj;
        }
    }

    public void cartDetails()
    {
        System.out.println("Items in my cart: ");
        for(int i = 0; i < c; i++) {
            System.out.println(i + ". " + items[i].name + ": " + items[i].price);
        }
    }
}













