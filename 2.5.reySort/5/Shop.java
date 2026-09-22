class Item {
    String name;
    int price;

    Item(String n, int p) {name = n; price = p;}
    void info() {
        System.out.println(name + " - " + price + " Tk");
    }
}





public class Shop {
    String name = null;
    Item[] arr = new Item[10];
    int c = 0;
    int max = 0;


    Shop(String n, int k) {
        name = n;
        arr = new Item[k];
        max = k;
    }
    Shop(int k) {
        this("Mega", k);
    }

    int find(String n) {
        int k = -1;
        for (int i = 0; i < c; i++) {
            if (n.equals(arr[i].name)) {
                return i;
            }
        }
        return k;
    }

    void info() {
        System.out.println("Shop Name: " + name);
        System.out.println("Item Details:");
        if (c == 0) {
            System.out.println("No items in shop");
        }
        else {
            for (int i = 0; i < c; i++) {
                arr[i].info();
            }
        }
    }

    void addItem(String n, int p) {
        if (c >= max) {
            System.out.println(n + ", could not be added");
            return;
        }
        Item k = new Item(n, p);
        arr[c] = k;
        c++;
    }

    /* Add Item from another shop */
    void addItem(Shop from, String n) {
        int k = from.find(n);
        if (k == -1) {
            System.out.println(n + ", not found in Agora!");
            return;
        }
        Item f = from.arr[k];       // extract source item
        from.remove(k);

        this.addItem(f.name, f.price);
    }

    void remove(int k) {
        // we are inside "source" now
        if (c == 0) return;

        arr[k]   = arr[c-1];
        arr[c-1] = null;
        c--;
    }

    void purchase(String n) {
        int k = find(n);
        if (k == -1) {
            System.out.println(n+", is not available in this shop");
        }
        else {
            System.out.println("Purchase Complete!");
        }
    }

}
