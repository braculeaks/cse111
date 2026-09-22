class Gadget {
   String name = "Just a gadget";

   public void m1() {System.out.println("Method1 of Gadget");}
   public void m2() {System.out.println(name);          m3();}
   public void m3() {System.out.println("Method3 of Gadget");}

   public String toString() {
       return "Name is: "+name;
   }
}

class Mobile extends Gadget {
   String name = "Just a mobile";
   public void m3()
   {
       System.out.println(name);
       super.m3();
   }
}

public class mau11 {
    public static void main(String[] args) {
        Object m1 = new Mobile();
        Computer pc1 = new PersonalComputer();
        Gadget c1 = new Computer();
        Computer wc1 = new WorkComputer();
        Gadget g1 = new Gadget();
        System.out.println(m1.name);
        System.out.println(m1);
        System.out.println(((Gadget) pc1).name);
        wc1.m4(10);
        System.out.println(((WorkComputer)  wc1).name);
        ((Gadget) pc1).m1();
        ((Gadget) m1).m2();
        ((Computer) m1).m2();
        ((Object) g1).m2();
    }
}


/* Write TRACING Output below

 */