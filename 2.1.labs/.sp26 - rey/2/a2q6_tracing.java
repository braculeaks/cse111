public class a2q6_tracing {
    public static void main(String [] args) {
        A a1 = new A();
        a1.methodA(2, 4);
        a1.methodB(3);
        A a2 = new A();
        a2.methodC(7);
        a1.methodB(3);
    }
}
