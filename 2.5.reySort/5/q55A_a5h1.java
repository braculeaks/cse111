public class q55A_a5h1 {         // Kora Hoy Nai
    public static void main(String[] args) {
        ProductStore p1 = new ProductStore("Table", 10); 
        ProductStore p2 = new ProductStore("Chair", 15);
        ProductStore p3 = new ProductStore("Sofa", 20);
        ProductStore p4 = new ProductStore("Divan", 8);
        System.out.println("------------1------------");
        ProductStore.displayProducts();
        System.out.println("------------2------------");
        System.out.println("Index: " + ProductStore.find("Sofa"));
        System.out.println("Index: " + ProductStore.find("Alien"));
        ProductStore.buy("Chair", 5);
        System.out.println("------------3------------");
        ProductStore.displayProducts();
        System.out.println("------------4------------");
        ProductStore.buy("Sofa", 25);
        System.out.println("------------5------------");
        ProductStore.displayProducts();
        System.out.println("------------6------------");
        ProductStore.buy("Bed", 10);
    }
}

/*

Stored: Table
Stored: Chair
Stored: Sofa
Storage is full! Cannot add Divan
------------1------------
=== Stored Products ===
Table - Qty: 10
Chair - Qty: 15
Sofa - Qty: 20
------------2------------
Index: 2
Index: -1
Product Sold
------------3------------
=== Stored Products ===
Table - Qty: 10
Chair - Qty: 10
Sofa - Qty: 20
------------4------------
Quantity low
------------5------------
=== Stored Products ===
Table - Qty: 10
Chair - Qty: 10
Sofa - Qty: 20
------------6------------
Product not found


 */