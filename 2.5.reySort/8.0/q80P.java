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


public class q80P {
    public static void main(String[] args) {
        Child obj1 = new Child();
        Parent p = (Parent) obj1;       //   upcasting: always safe

        Parent obj2 = new Child();      //   upcasting
        Child c = (Child) obj2;         // downcasting: co-incidentally safe, bcz actual type is Child

        Parent obj3 = new Parent();
        Child obj4 = (Child) obj3;      // downcasting: does it compile? yes.   does it run (safely)? no 
    }
}


/*

Casting = "Reference niye kotha"
Introducing: upcasting, downcasting, bad downcasting

*/