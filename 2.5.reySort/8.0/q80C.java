class A {
    public int sum = 1;
}
class B extends A {
    public int sum = 10;
}

public class q80C {
    public static void main(String[] args) {
        B b = new B();

        
        System.out.println(b.sum);          // 10
        System.out.println(((A)b).sum);     // 1
    }
}


/*

Introducing: up-casting

*/