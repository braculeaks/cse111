public class Cargo2 {
    static int total = 0;
    static double cap = 10.0;
    static double capacity() {
        return cap;
    }

    String content;
    int id;
    double weight;
    boolean isLoaded = false;

    Cargo2(String c, double w) {
        content = c;
        weight = w;
        total++;
        id = total;
    }

    void details() {
        
    }
}
