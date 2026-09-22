class A {
    public static int x = -10;
}

class B extends A {
    public static int x = 0;
}

public class q80E {
    public static void main(String[] args) {
        System.out.println(A.x);    // -10
        System.out.println(B.x);    // 0
    }
}


/*

Introducing: static in polymorphism + inheritance 

*/