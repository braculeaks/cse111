public class MoneyTracker {                 /* a3q4 */
    public String name = null;
    public double balance = 0.0;
    public double last_income = 0.0;
    public double last_expense = 0.0;

    MoneyTracker() {
        System.out.println("A new money tracker has been launched."); 
    }

    String info() {
        String output = "";
        output += "Name: " + this.name + "\n";
        output += "Current Balance: " + this.balance;
        return output;
    }

    void createTracker(String S) {
        this.name = S;
        this.balance = 1.0;
    }

    void income(int x) {
        this.balance += x;
        this.last_income = x;
        System.out.println("Balance Updated!");
    }

    void expense(int x) {
        if (x > balance) {
            System.out.println("Not enough balance.");
        }
        else if (x == balance) {
            this.balance = 0;
            this.last_expense = x;
            System.out.println("You're broke!");
        }
        else {
            this.balance -= x;
            this.last_expense = x;
            System.out.println("Balance Updated!");
        }
    }

    void showHistory() {
        System.out.println("Last added: " + last_income);
        System.out.println("Last spent: " + last_expense);
    }
}