public class Concert {              // a7q2
    String venue;
    String showtime;
    String[] artists = new String[5];
    int ac = 0;
    int soldA = 0;
    int soldB = 0;
    int soldVIP = 0;
    static int total_sold = 0;

    static void showTotalTicketsSold() {
        System.out.println("Total tickets sold (all venues): " + total_sold);
    }

    Concert(String v, String s) {
        venue = v;
        showtime = s;
    }

    void showDetails() {
        System.out.println("Venue: " + venue);
        System.out.println("Showtime: " + showtime);
        System.out.println("Artist: ");
        for (int i = 0; i < ac; i++) {
            System.out.println("-" + artists[i]);
        }
        System.out.println("Tickets sold in this concert: " + (soldA+soldB+soldVIP));
    }

    void addArtist(String a) {
        artists[ac++] = a;
    }

    void buyTicket(String z, int q) {
             if (z.equals("A")) {soldA += q; System.out.println("Total price: " + ( 500*q));}
        else if (z.equals("B")) {soldB += q; System.out.println("Total price: " + (1000*q));}
        total_sold += q;
    }

    void buyTicket(String z) {
        buyTicket(z, 1);
    }
}

class VIPConcert extends Concert {
    VIPConcert(String v, String s) {
        super(v, s);
    }

    void buyTicket() {
        soldVIP += 1;
        total_sold += 1;
        System.out.println("Total price: 2000");
    }
}
