public class q26_kni6 {
    public static void main (String args[]){
        Vehicle v1 = new Vehicle();
        v1.x = 0;
        v1.y = 0;
        System.out.println(v1.details());
        System.out.println("============");
        v1.moveUp();
        System.out.println(v1.details());
        System.out.println("============");
        v1.moveLeft();
        v1.moveDown();
        System.out.println(v1.details());
        System.out.println("============");
        v1.moveRight();
        System.out.println(v1.details());
        System.out.println("============");
    }
}

class Vehicle {
    int x = 0;
    int y = 0;

    void moveUp()    {y++;}
    void moveDown()  {y--;}
    void moveLeft()  {x--;}
    void moveRight() {x++;}

    String details() {return x + "," + y;}
}

/*

0,0
============
0,1
============
-1,0
============
0,0
============

 */