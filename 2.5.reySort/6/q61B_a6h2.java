public class q61B_a6h2 {
    public static void main(String [] args){
        System.out.println("Total Checking Accounts: "+CheckingAccount.count);
        CheckingAccount c1 = new CheckingAccount();
        System.out.println("Account Balance: " + c1.showBalance());
        CheckingAccount c2 = new CheckingAccount(100.0);
        System.out.println("Account Balance: " + c2.showBalance());
        CheckingAccount c3 = new CheckingAccount(200.0);
        System.out.println("Account Balance: " + c3.showBalance());
        System.out.println("Total Checking Accounts: "+CheckingAccount.count);
    }
}


class Account {
    public double balance = 0.0;
  
    public Account(double balance) {
        this.balance = balance;
    }
    public double showBalance() {
        return balance;
    }
}

class CheckingAccount extends Account {
    static int count = 0;

    CheckingAccount() {
        this(0.0);
        count++;
    }
    CheckingAccount(double b) {
        super(b);
        count++;
    }
}


/*

Introducing: "static"

Total Checking Accounts: 0
Account Balance: 0.0
Account Balance: 100.0
Account Balance: 200.0
Total Checking Accounts: 3

 */