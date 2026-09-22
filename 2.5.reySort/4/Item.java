public class Item {     // q44A
    
    String item;
    double price;

    Item(String s, double p){
        item = s;
        price = p;
    }
}

class ShoppingCart {
    int n = 0;
    Item [] items;
    int c = 0;

    ShoppingCart(int n) {          
        this.n = n;
        items = new Item[n];
    }

    public void addItem(Item i){
        if(c >= n){
            System.out.println("Item limit exceeded");
        }
        else {
            items[c] = i;
            c++;
        }
    }

    public void cartDetails() {
        System.out.println("Items in my cart: ");

        for(int i = 0; i < c; i++){
            System.out.println(i + ". " + items[i].item + ": " + items[i].price);
        }
    }
}