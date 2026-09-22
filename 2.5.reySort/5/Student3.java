public class Student3 {     // a5u2
    static int total = 0;
    static int cse = 0;
    static int other = 0;
    
    static void printDetails() {
        System.out.println("Total Student(s): " + total);
        System.out.println("CSE Student(s): " + cse);
        System.out.println("Other Student(s): " + other);
    }

    static Student3 createStudent(String n, double cg) {
        Student3 smth = new Student3(n, cg);
        return smth;
    }


    int id;
    String name;
    String dep = "CSE";
    double cgpa;

    Student3(String n, double cg, String d) {
        name = n;
        cgpa = cg; 
        dep = d;

        total++;
        if (d.equals("CSE")) cse++;
        else                 other++;

        id = total;
    }

    Student3(String n, double cg) {
        this(n, cg, "CSE");
    }

    void individualDetail() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Department: " + dep);
    }
}
