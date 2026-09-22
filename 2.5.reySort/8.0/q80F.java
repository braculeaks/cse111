class A {
    public static int x = 1;
    public int y = 2;
}

class B extends A {
    public static int x = 10;
    public int y = 20;

    public void show() {
        System.out.println(x);          // B.x = 10
        System.out.println(this.y);     // B.y = 20
        System.out.println(super.y);    // A.y = 2
        System.out.println(A.x);        // A static x = 1
        System.out.println(B.x);        // B static x = 10 
    }
}


public class q80F {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}

/*

All at once

*/

