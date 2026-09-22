public class mau13_p2 {
    public static int main(String[] args) {
        return 0;
    }
}


class Parallelogram extends Quadrilateral {      // mau13
    public String name = "Parallelogram";
    
    public void method3() {
        System.out.println("Parallelogram 3");
        super.method2();
        method4();
    }
}
class Rhombus extends Parallelogram {
    public String name = "Rhombus";
    
    public void method1() {
        System.out.println(this);
        System.out.println("Rhombus 1");
    }

    public void method3() {
        super.method2();
        System.out.println("Rhombus 3");
    }
}


class Rectangle extends Parallelogram {
    public String name = "Rectangle";
    
    public void method2() {
        method4();
        System.out.println("Rectangle 2");
        System.out.println(this);
    }
    
    public int compareTo(Rectangle a) {
        if(a instanceof Rectangle) {
                return 1;
        } else {
                return 0;
        }
    }
}
class Square extends Rectangle {
    public String name = "Square";
    
    public void method1() {
        method3();
        System.out.println("Square 1");
    }
    
    public void method2() {
        super.method2();
        System.out.println("Square 2");
        method3();
    }
}

