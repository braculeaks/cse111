public class q38_kni18 {
    public static void main (String args []){
        Bakery b1 = new Bakery("Sweet Cravings", 10);
        Bakery b2 = new Bakery("Dreamy Delights");
        b1.details();
        System.out.println("-----------------");
        b2.details();
        System.out.println("-----------------");
        b1.addItems("Cookies", 20);
        b1.addItems("Donuts", 15);
        b1.addItems("Muffins", 12);
        System.out.println("-----------------");
        b1.details();
        System.out.println("-----------------");
        b1.sellItems("Donuts",5);
        b1.sellItems("Cookies",7);
        System.out.println("-----------------");
        b1.sellItems("Cake",2);
        System.out.println("-----------------");
        b1.sellItems("Muffins",15);
        System.out.println("-----------------");
        b1.details();
    }
}


/*

Bakery Name: Sweet Cravings
Product Capacity: 10
Product Info:
-----------------
Bakery Name: Dreamy Delights
Product Capacity: 7
Product Info:
-----------------
20 Cookies are added.
15 Donuts are added.
12 Muffins are added.
-----------------
Bakery Name: Sweet Cravings
Product Capacity: 10
Product Info:
1) Cookies: 20 pieces
2) Donuts: 15 pieces
3) Muffins: 12 pieces
-----------------
5 Donuts are sold.
7 Cookies are sold.
-----------------
Item not found.
-----------------
Sorry! 15 Muffins are not available.
-----------------
Bakery Name: Sweet Cravings
Product Capacity: 10
Product Info:
1) Cookies: 13 pieces
2) Donuts: 10 pieces
3) Muffins: 12 pieces

*/