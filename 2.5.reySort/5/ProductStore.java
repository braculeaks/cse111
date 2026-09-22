class Product {
    String name;
    int qty;

    Product(String n, int q) {name = n; qty = q;}
    void details() {
        System.out.println(name + " - " + "Qty: " + qty);
    }
}

public class ProductStore {
    static Product[] arr = new Product[3];
    static int c = 0;
    static int max = 3;

    static void displayProducts() {
        System.out.println("=== Stored Products ===");
        for (int i = 0; i < c; i++) {
            arr[i].details();
        }
    }

    static int find(String n) {
        for (int i = 0; i < c; i++) 
        {
            if (n.equals(arr[i].name)) {
                return i;
            }
        }
        return -1;
    }

    static void buy(String n, int q) {
        int k = find(n);
        if (k == -1) {
            System.out.println("Product not found");
            return;
        }

        Product p = arr[k];
        if (p.qty < q) {
            System.out.println("Quantity low");
            return;
        }

            System.out.println("Product Sold");
            p.qty -= q;
    }

    ProductStore(String n, int q) {
        if (c >= max) {
            System.out.println("Storage is full! Cannot add "+n);
            return;
        }

        Product p = new Product(n, q);
        arr[c] = p;
        c++;
        System.out.println("Stored: "+n);
    }
}
