public class Triangle {         /* a4q1 */
    int a, b, c;
    int peri;

    public Triangle(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
        peri = x+y+z;
    }
    public void triangleDetails() {
        System.out.println("Three sides of the triangle are: " + a + ", " + b + ", " + c);
        System.out.println("Perimeter: " + peri);
    }
    public String printTriangleType() {
        String ans;
        if (a == b && b == c) {
            ans = "Equilateral";
        }
        else if (a == b || a == c || b == c) {
            ans = "Isoceles";
        }
        else {
            ans = "Scalene";
        }
        return "This is an " + ans + " Triangle.";
    }
    public void compareTriangles(Triangle t) {
        if (this == t) {
            System.out.println("These two triangle objects have the same address.");
        }
        else {
            if (this.a == t.a && this.b == t.b && this.c == t.c) {
                System.out.println("Addresses are different but the sides of the triangles are equal.");
            }
            else if (this.peri == t.peri) {
                System.out.println("Only the perimeter of both triangles is equal.");
            }
            else {
                System.out.println("Addresses, length of the sides and perimeter all are different.");
            }
        }
    }
}
