public class q42_kni22 {
    public static void main(String args []){
        Taxi t1 = new Taxi("MX8190", "Gulshan");
        Taxi t2 = new Taxi("MX6718", "Badda");
        Taxi t3 = new Taxi("MX2789", "Gulshan");
        System.out.println("1------------");
        t1.compareTaxi(t2);
        System.out.println("2------------");
        t1.compareTaxi(t3);
    }
}
