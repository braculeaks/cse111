public class q29_kni9 {
    public static void main(String args[]){
        Cart c1 = new Cart();
        System.out.println("1------------");
        c1.info();
        System.out.println("2------------");
        Cart c2 = new Cart();
        System.out.println("3------------");
        c1.addItem("Coke", 12);
        c1.addItem("Biscuit", 50);
        System.out.println("4------------");
        c1.info();
        System.out.println("5------------");
        c1.addItem("Chocolate",15);
        System.out.println("6------------");
        c1.info();
        System.out.println("7------------");
        c1.addItem("Pen",5);
        System.out.println("8------------");
        c1.info();
        System.out.println("9------------");
        c2.addItem("Water",10);
        System.out.println("10------------");
        c2.info();
    }
}

/*

1------------
Cart capacity: 3
Total Item: 0
Total Price: 0 Taka
Item List:

2------------
3------------
Coke is added to cart.
Biscuit is added to cart.
4------------
Cart capacity: 3
Total Item: 2
Total Price: 62 Taka
Item List:
Coke Biscuit
5------------
Chocolate is added to cart.
6------------
Cart capacity: 3
Total Item: 3
Total Price: 77 Taka
Item List:
Coke Biscuit Chocolate
7------------
Cart is full
8------------
Cart capacity: 3
Total Item: 3
Total Price: 77 Taka
Item List:
Coke Biscuit Chocolate
9------------
Water is added to cart.
10------------
Cart capacity: 3
Total Item: 1
Total Price: 10 Taka
Item List:
Water

 */