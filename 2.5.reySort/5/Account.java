public class Account {          // q52
    static String bankName = "Badda Bank";
    static int count = 0;
    static double totalBalance = 0.0;

    // BluePrint doesn't occupy memory = false;

    String name;
    String addr;
    private double bal;

    // Without calling constructor, can't create object
    Account(String n, String a) {
        this.name = n;
        this.addr = a;
        count += 1;
    }

    void printInfo() {
        System.out.println("Name: " + name + ", address: " + addr);
        System.out.println("Balance: " + bal + " Taka");
    }

    void   setBalance(int b)   {this.bal += b; totalBalance += b;}
    double getBalance() {return this.bal;}
}