public class a4q1 {
    public static void main(String args[]){
      Triangle t1 =  new Triangle(4, 4, 4);
      Triangle t2 =  new Triangle(4, 5, 6);
      Triangle t3 =  new Triangle(4, 5, 6);
      Triangle t4 =  new Triangle(5, 4, 6);
   
      t1.triangleDetails();
      System.out.println("--------1--------");
      System.out.println(t1.printTriangleType());
      System.out.println("--------2--------");
      t3.triangleDetails();
      System.out.println(t3.printTriangleType());
      System.out.println("--------3--------");
      t4.triangleDetails();
      System.out.println(t4.printTriangleType());
      System.out.println("--------4--------");
      t2.compareTriangles(t3);
      System.out.println("--------5--------");
      t1.compareTriangles(t2);
      System.out.println("--------6--------");
      t1 = t2;
      t1.compareTriangles(t2);
      System.out.println("--------7--------");
      t3.compareTriangles(t4);
    }
   }
   


/**
 * 
Three sides of the triangle are: 4, 4, 4
Perimeter: 12
--------1--------
This is an Equilateral Triangle.
--------2--------
Three sides of the triangle are: 4, 5, 6
Perimeter: 15
This is a Scalene Triangle.
--------3--------
Three sides of the triangle are: 5, 4, 6
Perimeter: 15
This is a Scalene Triangle.
--------4--------
Addresses are different but the sides of the triangles are equal.
--------5--------
Addresses, length of the sides and perimeter all are different.
--------6--------
These two triangle objects have the same address.
--------7--------
Only the perimeter of both triangles is equal.

*/