public class q50a {
    public static void main(String [] args) {
        Hero h1 = new Hero("Arthur", 12);
        Hero h2 = new Hero("Lancelot", 8);
        Hero h3 = new Hero("Galahad", 15);
        Hero h4 = new Hero("Merlin", 20);
        System.out.println(" 1============== ");
        Guild g1 = new Guild("Knights");
        Guild g2 = new Guild("Mages");
        g1.addHero(h1);
        g1.addHero(h2);
        g1.addHero(h3);
        System.out.println(" 2============== ");
        g1.showDetails();
        System.out.println(" 3============== ");
        g1.requestTransfer(g2 , "Lancelot");
        g1.requestTransfer(g2 , "Arthur");
        System.out.println(" 4============== ");
        g2.addHero(h4);
        g1.requestTransfer(g2 , "Galahad");
        System.out.println(" 5============== ");
        g1.showDetails();
        System.out.println(" 6============== ");
        g2.showDetails();
    }
}