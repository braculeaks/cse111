public class q52a_kni25 {        // kora hoy nai
    public static void main(String[] args){
        Shop s1 = new Shop("Agora", 4);
        Shop s2 = new Shop(3);
        System.out.println("1==============");
        s1.info();
        System.out.println("2==============");
        s2.info();
        System.out.println("3==============");
        s1.addItem("KitKat", 25);
        s1.addItem("Hershey's", 100);
        s1.addItem("Dairy Milk", 150);
        s1.addItem("Feastables", 500);
        s1.addItem("Prime", 1200);
        System.out.println("4==============");
        s1.info();
        System.out.println("5==============");
        s1.purchase("KitKat");
        s1.purchase("Snickers");
        System.out.println("6==============");
        s2.info();
        System.out.println("7==============");
        s2.addItem(s1, "KitKat");
        s2.addItem("Toblerone", 80);
        s2.addItem(s1, "Mars");
        System.out.println("8==============");
        s2.info();
    }
}



/*

Max Items: 4

Agora shop created!
Mega shop created!
1==============
Shop Name: Agora
Item Details:
No items in shop
2==============
Shop Name: Mega
Item Details:
No items in shop
3==============
Prime, could not be added
4==============
Shop Name: Agora
Item Details:
4 / 4
KitKat - 25 Tk
Hershey's - 100 Tk
Dairy Milk - 150 Tk
Feastables - 500 Tk
5==============
Purchase Complete!
Snickers, is not available in this shop
6==============
Shop Name: Mega
Item Details:
No items in shop
7==============
Mars, not found in Agora!
8==============
Shop Name: Mega
Item Details:
2 / 3
KitKat - 25 Tk
Toblerone - 80 Tk

 */
