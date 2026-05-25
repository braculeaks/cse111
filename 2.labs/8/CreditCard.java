public class CreditCard {               /* a8h2 */
    public String cardHolder;
    public String accountNo;
    public int rewardPoints;
    public CreditCard(String cardHolder, String accountNo, int rewardPoints){
        this.cardHolder = cardHolder;
        this.accountNo = accountNo;
        this.rewardPoints = rewardPoints;
    }
    public void cardDetails() {
        System.out.println("Card Holder Name: " + cardHolder);
        System.out.println("Account Number: " + accountNo);
        System.out.println("Reward point gained: " + rewardPoints);
    }
}

class PlatinumCard extends CreditCard {
    PlatinumCard(String u, String ac) {
        super(u, ac, 100);
    }

    void spendCash(int m) {
        System.out.println("Previous Reward Points: " + super.rewardPoints);

        int x = m/100;
        int rp = x*2;
        super.rewardPoints += rp;

        System.out.println("Reward points after spending "+m+" taka: " + super.rewardPoints);
    }
}

class SignatureCard extends CreditCard {
    SignatureCard(String u, String ac) {
        super(u, ac, 200);
    }

    void spendCash(int m) {
        System.out.println("Previous Reward Points: " + super.rewardPoints);

        int x = m/100;
        int rp = x*4;
        super.rewardPoints += rp;

        System.out.println("Reward points after spending "+m+" taka: " + super.rewardPoints);
    }

    @Override
    public void cardDetails() {
        super.cardDetails();
        System.out.println("Possible Number of Companions for Lounge: 5");
    }
}