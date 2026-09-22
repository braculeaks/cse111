public class a8c5 {
    public static void main(String[] args) {
        Chocolate choco1 = new Chocolate();
        KitKat kit = new KitKat();
        DairyMilk dairyMilk1 = new DairyMilk();
        DairyMilk dairyMilk2 = new SilkOreo();
        Object obj1 = new DairyMilk();
        Object obj2 = new KitKat();
        Chocolate caramel1 = new Caramel();

        choco1.method1();
        dairyMilk1.method1();
        dairyMilk2.method4();
        caramel1.method1();

        System.out.println(caramel1);
        System.out.println(caramel1.texture);

        ((Chocolate) kit).method2();
        ((SilkOreo) dairyMilk2).method3();
        ((DairyMilk) kit).method2();
        ((Chocolate) kit).method3();

        ((Chocolate) dairyMilk2).method1();
        ((Chocolate) obj1).method2();
        ((Caramel) obj1).method2();
        ((SilkOreo) obj2).method3();

        System.out.println(((Object) choco1).toString());
        System.out.println(((Chocolate) kit).texture);
    }
}

/*
    Task:
        1. Draw a inheritance Diagram
        2. Calculate output of lines 11-30
 */


class Chocolate {
    String texture = "Chocolaty";

    public void method1() {
        method2();
        System.out.println("Chocolate m1");
    }

    public void method2() {
        System.out.println("Chocolate m2");
    }

    public String toString() {
        method2();
        return "Chocolate is " + texture;
    }
}

class DairyMilk extends Chocolate {
    String texture = "Yummy";

    public void method2() {
        System.out.println(this.texture);
        System.out.println("DairyMilk m2");
    }

    public void method3() {
        System.out.println("DairyMilk m3");
    }
}

class KitKat extends Chocolate {
    String texture = "Crunchy";

    public void method1() {
        System.out.println("KitKat m1");
    }

    public void method4() {
        System.out.println("KitKat m4");
    }

    public String toString() {
        method2();
        return "KitKat is " + texture;
    }
}

class SilkOreo extends DairyMilk {
    String texture = "Silky";

    public void method1() {
        super.method1();
        System.out.println("SilkOreo m1");
    }

    public void method3() {
        System.out.println("SilkOreo m3");
        System.out.println(this);
    }
}

class Caramel extends SilkOreo {
    String texture = "Softy";

    public void method1() {
        System.out.println("Caramel m1");
    }

    public void method4() {
        System.out.println("Caramel m4");
    }

    public String toString() {
        method2();
        return "Caramel is " + texture;
    }
}
