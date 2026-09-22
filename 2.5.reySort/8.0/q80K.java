class Parent {
    public String texture = "Parent";
}

class Child extends Parent {
    public String texture = "Child";
}

public class q80K {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.texture);   // Parent
    }
}


/*

Introducing: Variable Lookup
Introducing: "Method Overloading" v/s "Variable Hiding"

*/