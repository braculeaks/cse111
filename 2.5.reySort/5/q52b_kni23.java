public class q52b_kni23 {        // kora hoy nai
    public static void main(String args[]){
        Cart c1 = new Cart();
        Cart c2 = new Cart();
        Cart c3 = new Cart();
        Cart cartHub = new Cart();
        c1.storeProduct("Pen", 10);
        c2.storeProduct("Pencil", 15, "Book", 100);
        c2.storeProduct("Eraser", 5);
        c3.storeProduct("Sharpener", 8);
        System.out.println("1------------");
        c1.info();
        System.out.println("2------------");
        c2.info();
        System.out.println("3------------");
        c1.transferItem(c2, "Pen");
        System.out.println("4------------");
        c1.info();
        System.out.println("5-----------");
        c2.info();
        System.out.println("6-----------");
        cartHub.addCart(c1,c2,c3);
        System.out.println("7-----------");
        cartHub.allCartInfo();
    }
}


/*

kni23

1------------
Cart Items:
Pen - 10
2------------
Cart Items:
Pencil - 15
Book - 100
Eraser - 5
3------------
Item transferred successfully.
4------------
Cart Items:
Cart is empty.
5-----------
Cart Items:
Pencil - 15
Book - 100
Eraser - 5
Pen - 10
6-----------
7-----------
Cart Items:
Cart is empty.
Cart Items:
Pencil - 15
Book - 100
Eraser - 5
Pen - 10
Cart Items:
Sharpener - 8

 */