public class Shape2D {
    int x;
    int y;
    int z;
    boolean ThreeSideMode = false;
    String name;

    void area() {
        double area = (x*y);

        if (name.equals("Triangle")) {
            area /= 2;
        }

        if (ThreeSideMode == true) {
            double s = (x+y+z)/2;
            area = Math.sqrt(s*(s-x)*(s-y)*(s-z));
        }

        System.out.println("The area of the "+this.name+" is: "+area);
    }

    Shape2D() {
        this.x = 5;
        this.y = 5;
        this.name = "Square";
        System.out.println(
            "A Square has been created with length: " + this.x
        );
    }
    
    Shape2D(int x, int y) {
        this.x = x;
        this.y = y;
        this.name = "Rectangle";
        System.out.println(
            "A Rectangle has been created with length: " 
            + this.x + " and breath: " + this.y
        );
    }

    Shape2D(int x, int y, String S) {
        this.x = x;
        this.y = y;
        this.name = S;
        System.out.println(
            "A "+this.name+" has been created with height: " 
            + this.x + " and base: " + this.y
        );
    }

    Shape2D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = "Triangle";
        this.ThreeSideMode = true;
        System.out.println(
            "A Triangle has been created with the following sides: " 
            + this.x + ", " + this.y + ", " + this.z
        );
    }
}

/*

A Square has been created with length: 5
---------1----------
The area of the Square is: 25.00
---------2----------
A Rectangle has been created with length: 5 and breath: 6
---------3----------
The area of the Rectangle is: 30.00
---------4----------
A Triangle has been created with height: 5 and base: 6
---------5----------
The area of the Triangle is: 15.00
---------6----------
A Triangle has been created with the following sides: 5, 6, 7
---------7----------
The area of the Triangle is: 14.70

*/