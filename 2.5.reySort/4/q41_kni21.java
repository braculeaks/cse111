import java.util.Arrays;
public class q41_kni21 {
    public static void main(String [] args){
        Department cse = new Department("CSE", 1200);
        Department cs = new Department("CS", 700);
        System.out.println("1--------------------");
        cse.info();
        System.out.println("2--------------------");
        cs.info();
        System.out.println("3--------------------");
        cse.mergeStudents(cs);
        System.out.println("4--------------------");
        cse.info();
        System.out.println("5--------------------");
        int [] newStudents = {12, 13, 16};
        cse.addStudents(newStudents);
        System.out.println("6--------------------");
        cse.info();
        System.out.println("7--------------------");
        System.out.println(Arrays.toString(newStudents));
    }
}


/*

1--------------------
Name: CSE
Total Students: 1200
2--------------------
Name: CS
Total Students: 700
3--------------------
Students of CS are merged with students of CSE
4--------------------
Name: CSE
Total Students: 1900
5--------------------
6--------------------
Name: CSE
Total Students: 1941
7--------------------
[0, 0, 0]

 */