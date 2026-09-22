public class q83_a8h2 {
    public static void main(String[] args) {
        CreditCard card1 = new PlatinumCard("Ali", "345 127");
        CreditCard card2 = new SignatureCard("Rahul", "514 123");
        CreditCard card3 = new SignatureCard("Rohan", "147 965");
        CreditCard [] cards = {card1, card2, card3};
        for (int i = 0; i<cards.length; i++)
        {
            System.out.println("================");
            if (cards[i] instanceof SignatureCard)
            {
                SignatureCard new_card = (SignatureCard) cards[i];
                new_card.spendCash(500);
            }
            else if (cards[i] instanceof PlatinumCard)
            {
                PlatinumCard new_card = (PlatinumCard) cards[i];
                new_card.spendCash(200);
            }
            System.out.println("================");
            cards[i].cardDetails();
        }
    }
}


/*

Platinum card users 
    - initially have 100 reward points
    - will get 2 reward points for spending 100 taka each.

Siognature card users
    - initially have 200 reward points
    - will get 4 reward points for spending 100 taka each.
    - are allowed to bring upto 5 companions at lounges.


================
Previous Reward Points: 100
Reward points after spending 200 taka: 104
================
Card Holder Name: Ali
Account Number: 345 127
Reward point gained: 104
================
Previous Reward Points: 200
Reward points after spending 500 taka: 220
================
Card Holder Name: Rahul
Account Number: 514 123
Reward point gained: 220
Possible Number of Companions for Lounge: 5
================
Previous Reward Points: 200
Reward points after spending 500 taka: 220
================
Card Holder Name: Rohan
Account Number: 147 965
Reward point gained: 220
Possible Number of Companions for Lounge: 5

 */