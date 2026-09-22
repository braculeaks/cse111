public class q45D_rey4 {
    public static void main(String[] args) {
        Product p1 = new Product("Keyboard", 50.0);
        Product p2 = new Product("Monitor", 360.0);

        Store myStore = new Store(5);   // max products: 5  

        System.out.println("--- Adding Stock ---");
        myStore.addStock(p1, 10);
        myStore.addStock(p2, 5);

        System.out.println("\n--- Inventory Report ---");
        myStore.displayInventory();

        System.out.println("\nTotal Store Value: $" + myStore.calculateTotalValue(p1, p2));
    }
}


/*

All attributes of Product class should be private
Store class can have 1 array of products, 1 array of quantities

Keyboard : Qty : 10
Monitor : Qty : 5

--- Adding Stock ---
Restocked: Keyboard
Restocked: Monitor

--- Inventory Report ---
0: Keyboard | $50.0 | Stock: 10
1: Monitor | $200.0 | Stock: 5

Total Store Value: $1500.0

*/ 