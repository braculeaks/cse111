public class q52c_a5q1 {
    public static void main(String[] args) {
        System.out.print("All accounts belong to ");
        System.out.println(Account.bankName);
        System.out.println("Accounts created: " + Account.count);
        System.out.print("Total Money stored ");
        System.out.println(Account.totalBalance + " taka");


        System.out.println("1---------------------------------");
        Account a1 = new Account("Abir", "Dhanmondi");
        System.out.println("2---------------------------------");
        a1.printInfo();
        System.out.println("3---------------------------------");
        Account a2 = new Account("Mira", "Mirpur");
        a2.printInfo();
        System.out.println("4---------------------------------");
        a1.setBalance(1000);
        System.out.println("5---------------------------------");
        a1.printInfo();
        a2.setBalance(2000);
        System.out.println("6---------------------------------");
        System.out.println(a2.getBalance());
        System.out.println("7---------------------------------");
        a2.setBalance(500);
        System.out.println("8---------------------------------");
        a2.printInfo();
        
        System.out.println("9---------------------------------");
        System.out.print("All accounts belong to ");
        System.out.println(Account.bankName);
        System.out.println("Accounts created: " + Account.count);
        System.out.print("Total Money stored ");
        System.out.println(Account.totalBalance + " taka");
    }
}


/*

All accounts belong to Badda Bank
Accounts created: 0
Total Money stored 0.0 taka
1---------------------------------
2---------------------------------
Name: Abir, address: Dhanmondi
Balance: 0.0 Taka
3---------------------------------
Name: Mira, address: Mirpur
Balance: 0.0 Taka
4---------------------------------
5---------------------------------
Name: Abir, address: Dhanmondi
Balance: 1000.0 Taka
6---------------------------------
2000.0
7---------------------------------
8---------------------------------
Name: Mira, address: Mirpur
Balance: 2500.0 Taka
9---------------------------------
All accounts belong to Badda Bank
Accounts created: 2
Total Money stored 3500.0 taka

*/