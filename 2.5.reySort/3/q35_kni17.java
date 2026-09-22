public class q35_kni17 {
    public static void main(String[] args){
        Toy t1 = new Toy("Car", 230);
        System.out.println("1=================");
        t1.updatePrice(250);
        System.out.println("2=================");
        System.out.println(t1.name);
        t1.showPrice();
        System.out.println("3=================");
        Toy t2 = new Toy("Robot", 450);
        System.out.println("4=================");
        t2.updateName("Autobot");
        System.out.println("5=================");
        System.out.println(t2.name);
        t2.showPrice();
    }
}


/*

A new toy has been made!
1=================
2=================
Car
price: 250 Taka
3=================
A new toy has been made!
4=================
Changing old name: Robot
new name: Autobot
5=================
Autobot
price: 450 Taka

 */