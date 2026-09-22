public class Mobile {           // 33
    String brand = null;
    String simType = null;

    Mobile() {
        System.out.println("A mobile is created");
    }

    public void printDetails() {
        System.out.println("Brand: "+ brand);
        System.out.println("Sim Type: "+ simType);
    }
}
