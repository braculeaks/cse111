class A {
    public static int x = 5;
    public int y = 7;

    public void methodA(int y) {
        int x = 2;
        System.out.println(x + " " + y + " " + this.y + " " + this.x);
    }
}

public class q80G {
    public static void main(String[] args) {
        A obj = new A();
        obj.methodA(101);       // 2 101 7 5;
    }
}

/*

Introducing: Local Shadowing (1)

    Variable accessing priorities:
        1. Local Variable
        2. Check this
        3. Check parent

*/