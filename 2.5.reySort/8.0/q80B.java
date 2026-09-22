class A {
    public int sum = 1;
}
class B extends A {
    public int sum = 10;
}

public class q80B {
    public static void main(String[] args) {
        B b = new B();
        A a = (A)b;        // upcasting

        System.out.println(b.sum);     // 10
        System.out.println(a.sum);     // 1
    }
}


/*

Introducing: up-casting

*/