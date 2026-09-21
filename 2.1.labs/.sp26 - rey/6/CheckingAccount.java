public class CheckingAccount extends Account {      /* a6q2 */
    static int count = 0;

    CheckingAccount() {
        super(0.0);
        count++;
    }

    CheckingAccount(double b) {
        super(b);
        count++;
    }
}