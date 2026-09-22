public class Tea {
    public String name;
    protected int price;
    protected boolean status;

    public Tea(String name, int price) {
        this.name = name;
        this.price = price;
        this.status = false;
    }
    public void productDetail() {
        System.out.println("Name: " + name + ", Price: " + price);
        System.out.println("Status: " + status);
    }
}


public class q74_a7u1 {
    public static void main(String[] args) {
        KKTea t1 = new KKTea(250, 50);
        System.out.println("--------1---------");
        t1.productDetail();
        System.out.println("--------2---------");
        KKTea.totalSales();
        System.out.println("--------3---------");
        KKTea t2 = new KKTea(470, 100);
        KKTea t3 = new KKTea(360, 75);
        KKTea.updateSoldStatusRegular(t1);
        KKTea.updateSoldStatusRegular(t2);
        System.out.println("--------4---------");
        t2.productDetail();
        System.out.println("--------5---------");
        KKTea.totalSales();
        System.out.println("--------6---------");
        KKFlavouredTea t4 = new KKFlavouredTea("Jasmine", 260, 50);
        KKFlavouredTea t5 = new KKFlavouredTea("Honey Lemon", 270, 45);
        KKFlavouredTea t6 = new KKFlavouredTea("Honey Lemon", 270, 45);
        System.out.println("--------7---------");
        t4.productDetail();
        System.out.println("--------8---------");
        t6.productDetail();
        System.out.println("--------9---------");
        KKFlavouredTea.updateSoldStatusFlavoured(t4);
        KKFlavouredTea.updateSoldStatusFlavoured(t5);
        KKFlavouredTea.updateSoldStatusFlavoured(t6);
        System.out.println("--------10---------");
        KKTea.totalSales();
    }
}

/*

Design the KKTea (parent) and KKFlavouredTea (child) classes so that the following output is produced.

The KKFlavouredTea class should inherit KKTea and KKTea should inherit the Tea class.

Note that:
● An object of either class represents a single box of teabags.
● Each tea bag weighs 2 grams.
● The status of an object refers to whether it is sold or not


--------1---------
Name: KK Regular Tea, Price: 250
Status: false
Weight: 100, Tea Bags: 50
--------2---------
Total Sales: 0
KK Regular Tea: 0
--------3---------
--------4---------
Name: KK Regular Tea, Price: 470
Status: true
Weight: 200, Tea Bags: 100
--------5---------
Total Sales: 2
KK Regular Tea: 2
--------6---------
--------7---------
Name: KK Jasmine Tea, Price: 260
Status: false
Weight: 100, Tea Bags: 50
--------8---------
Name: KK Honey Lemon Tea, Price: 270
Status: false
Weight: 90, Tea Bags: 45
--------9---------
--------10---------
Total Sales: 5
KK Regular Tea: 2
KK Flavoured Tea: 3

 */