public class q24_adu3 {
    public static void main(String[] args) {
        Course c1 = new Course();
        Course c2 = new Course();
        System.out.println("========== 1 ==========");
        c1.createCourse("Programming Language I", "CSE110", 3);
        c1.displayCourse();
        System.out.println("========== 2 ==========");
        c2.createCourse("Data Structures", "CSE220", 3);
        c2.displayCourse();
        System.out.println("========== 3 ==========");
        c1.updateCourse("Programming Language II", "CSE111", 3);
        c1.displayCourse();
    }
}

/*

========== 1 ==========
Course Name: Programming Language I
Course Code: CSE110
Course Credit: 3
========== 2 ==========
Course Name: Data Structures
Course Code: CSE220
Course Credit: 3
========== 3 ==========
Course Name: Programming Language II
Course Code: CSE111
Course Credit: 3

 */