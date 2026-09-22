public class q31A_kni12 {
    public static void main(String [] args){
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        Student2 s3 = new Student2();
        Student2 s4 = new Student2();
        s1.updateInfo("Ali");
        System.out.println("1-----------");
        s1.details();
        System.out.println("2-----------");
        s2.updateInfo("Joy", "MNS");
        s3.updateInfo("Akash", 3.99, "CS");
        s4.updateInfo("Rakin", "PHY", 3.89);
        System.out.println("3-----------");
        s2.details();
        System.out.println("4-----------");
        s3.details();
    }
}


/*

1-----------
Name: Ali
Department: CSE
CGPA: 0.0
2-----------
3-----------
Name: Joy
Department: MNS
CGPA: 0.0
4-----------
Name: Akash
Department: CS
CGPA: 3.99

 */