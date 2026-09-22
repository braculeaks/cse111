class Parent {
    public void greet() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    @Override
    public void greet() {
        System.out.println("Child");
    }
}


public class q80I {
    public static void main(String[] args) {
        Parent p = new Child();
        p.greet();                  // Child
    }
}


/*

Biggest Rule of Python: "Explicit > Implicit" (actually)

Introducing: Function V-Table
    Method Overriding, Polymorphism in action

*/