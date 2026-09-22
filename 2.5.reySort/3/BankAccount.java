public class BankAccount {      // q32
    int ac = 2324;
    String type = "Salary";

    BankAccount() {
        System.out.println("A new account has been created");
    }
    public void info() {
        System.out.println("Account No: " + ac);
        System.out.println("Type: " + type);
    }
}
