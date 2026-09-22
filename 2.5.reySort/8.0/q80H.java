class A {
    public int x = 5;
    public int y = 7;

    public void methodA(int y) {
        int x = 2;
        System.out.println(x + " " + y + " " + this.y + " " + this.x);
    }
}

class B extends A {
    public static int x = 50;
    public void show() {
        System.out.println(x);
    }
}

public class q80H {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();             // prints 50
    }
}

/*

Introducing: Local Shadowing (2)

*/