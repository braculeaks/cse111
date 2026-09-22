class Parent {
    public void greet() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    public void secret() {
        System.out.println("Child secret");
    }
}


public class q80J {
    public static void main(String[] args) {
        Parent p = new Child();
        p.secret();             // because of up-casting, compiler is blind
    }
}


/*

Introducing: Reference Type Bullshittery
Introducing: Compile-Time Error

*/