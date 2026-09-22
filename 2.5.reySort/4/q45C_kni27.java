public class q45C_kni27 {
    public static void main(String [] args){
        Teacher t1 = new Teacher("Matin Saad Abdullah","MSA");
        Teacher t2 = new Teacher("Mumit Khan","MMK");
        Teacher t3 = new Teacher("Sadia Hamid Kazi","SKZ");
        Course c1 = new Course("CSE 110");
        Course c2 = new Course("CSE 111");
        Course c3 = new Course("CSE 220");
        Course c4 = new Course("CSE 221");
        Course c5 = new Course("CSE 230");
        Course c6 = new Course("CSE 310");
        Course c7 = new Course("CSE 320");
        Course c8 = new Course("CSE 340");
        t1.addCourse(c1);
        t1.addCourse(c2);
        t2.addCourse(c3);
        t2.addCourse(c4);
        t2.addCourse(c5);
        t3.addCourse(c6);
        t3.addCourse(c7);
        t3.addCourse(c8);
        System.out.println("1========================");
        t1.printDetail();
        System.out.println("2========================");
        t2.printDetail();
        System.out.println("3========================");
        t3.printDetail();
    }
}


/*

- All attributes of Course class must be Private

this is also, assignment 4 classwork 2 (a4c2)


A new teacher has been created
A new teacher has been created
A new teacher has been created
1========================
Name: Matin Saad Abdullah
Initial: MSA
List of courses:
CSE 110
CSE 111
2========================
Name: Mumit Khan
Initial: MMK
List of courses:
CSE 220
CSE 221
CSE 230
3========================
Name: Sadia Hamid Kazi
Initial: SKZ
List of courses:
CSE 310
CSE 320
CSE 340

 */