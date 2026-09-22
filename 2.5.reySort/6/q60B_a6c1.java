public class q60B_a6c1 {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.name = "Mobius Strip";
        s.color = "Blue";
        s.displayInfo();
        System.out.println("1=======================");
        Circle c = new Circle();
        System.out.println("2=======================");
        c.name = "Circle";
        c.color = "Red";
        c.radius = 5;
        c.displayInfo();
        System.out.println("3=======================");
        c.area();
    }
}

class Shape {
    public String name;
    public String color;
    public void displayInfo() {
        System.out.printf("Name: %s\nColor: %s\n", name, color);
    }
}

class Circle extends Shape {
    int radius;
    public void area(){
        double a = radius * radius * 3.14;
        System.out.println("Area of " + color + " " + name + ": " + a);
    }
}


/*

(Task for Student)

Name: Mobius Strip
Color: Blue
1=======================
2=======================
Name: Circle
Color: Red
3=======================
Area of Red Circle: 78.54

 */