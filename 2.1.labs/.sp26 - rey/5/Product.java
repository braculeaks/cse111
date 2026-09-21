public class Product {                  /* a5q1 */
    static String storage[] = new String[3];
    static int quantity[] = new int[3];
    static int c = 0;

    Product(String n, int qty) {
        if (c < 3) {
            storage[c] = n;
            quantity[c] = qty;
            System.out.println("Stored: " + n);
            c++;
        }
        else {
            System.out.println("Storage is full! Cannot add " + n);
        }
    }

    static void displayProducts() {
        System.out.println("=== Stored Products ===");
        for (int i = 0; i < c; i++) {
            System.out.println(storage[i] + " - " + "Qty: " + quantity[i]);
        }
    }

    static int find(String n) {
        for (int i = 0; i < c; i++) {
            if (storage[i].equals(n)) {
                return i;
            }
        }

        return -1;
    }

    static void buy(String n, int q) {
        int k = find(n);
        if (k == -1) {
            System.out.println("Product not found");
        }
        else {
            if (q > quantity[k]) {
                System.out.println("Quantity low");
            }
            else {
                quantity[k] -= q;
                System.out.println("Product Sold");
            }
        }
    }
}
