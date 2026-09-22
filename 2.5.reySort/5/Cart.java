public class Cart {     // kni23
    String [] item = new String[10];
    int [] amount = new int[10];
    int count = 0;
    Cart [] cartHub = new Cart[3];

    public void storeProduct (String s, int n){
        item[count] = s;
        amount[count] = n;
        count++;
    }

    public void storeProduct (String s1, int n1, String s2, int n2){
        storeProduct(s1, n1);
        storeProduct(s2, n2);
    }


    public int find(String s) {     // it is running on c2
        int k = -1;
        for (int i = 0; i < count; i++) {
            if (s.equals(item[i])) {
                return i;
            }
        }
        return k;
    }

    public void remove(int k) {
        if (c == 0) return;

        item[k]         = item[count-1];
        amount[k]       = amount[count-1];
        item[count-1]   = null;
        amount[count-1] = 0;
        count--;
    }

    public void transferItem (Cart target, String s) {    // running on c1
        int k = this.find(s);
        if (k == -1) {
            System.out.println("Could not find " + s);
        }
        else {
            target.storeProduct(s, this.amount[k]);
            this.remove(k);
            System.out.println("Item transferred successfully.");
        }
    }

    public void info() {
        System.out.println("Cart items:");

        if (count == 0) 
            System.out.println("Cart is empty.");

        else {
            for(int i = 0; i < count; i++)
                System.out.println(item[i] + " - " + amount[i]);
        }
    }

    public void addCart (Cart c1, Cart c2, Cart c3) {
        cartHub[0] = c1;
        cartHub[1] = c2;
        cartHub[2] = c3;
    }

    public void allCartInfo(){
        cartHub[0].info();
        cartHub[1].info();
        cartHub[2].info();
    }
}
