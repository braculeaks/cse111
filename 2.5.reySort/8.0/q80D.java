class A {
    public int x = 1;
    public void show() {
        System.out.println("A");
    }
}

class B extends A {
    public int x = 2;
    
    @Override
    public void show() {
        System.out.println("B");
    }
}


public class q80D {
    public static void main(String[] args) {
        A ref = new B();            // up-casting
        ref.show();                 // B
        System.out.println(ref.x);  // 1
    }
}

/*

A obj = new B();
    1.    Actual Type: B
    2. Reference Type: A

Introducing: "Method Overloading" v/s "Variable Hiding"
    1. obj.show() is a method call.
    2. obj.x is a variable/field access

Polymorphism
    1. Methods   are     polymorphic
    2. Variables are not polymorphic

One more difference table
    1. A.show() --> still overriden latest one is used
    2. A.x      --> prints A.x   (no polymorphism)

*/