public class mau11_p2 {
    public static int main(String[] args) {
        return 0;
    }
}

class Computer extends Gadget {      // mau11
   String name = "Computer";

   public void m3()      {System.out.println(super.name);    m1();}
   public void m4(int i) {System.out.println(i * 3);}

   public String toString() {
       return "Name is: "+name;
   }
}

class PersonalComputer extends Computer {
   String name = "Personal Computer";

   public void m1() {
       System.out.println(super.toString());
       System.out.println(this.name);
       System.out.println(((Gadget)this).name);
       System.out.println(this);
       System.out.println((Computer)this);
       ((Computer)this).m4(20);
   }

   public String toString() {
       return "Name is: "+name;
   }
}

class WorkComputer extends Computer {
   public void m4(double i) {
       System.out.println(this.name);
       System.out.println(i * 2);
       System.out.println("Method4 of WorkComputer");
   }
}