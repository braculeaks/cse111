public class Student4 {
    static int    total_students = 0;
    static double total_marks    = 0;

    static double averageMarks() {
        if (total_students == 0) return 0;
        else return (total_marks/total_students);
    }

    int cm = 0;
    int tm = 0;
    int marks = 0;
    String name;
    int id;

    Student4(String n) {
        name = n;
        total_students++;
        id = total_students;
    }

    Student4(String n, int cm, int tm) {
        this(n);
        this.cm = cm;
        this.tm = tm;
        marks = cm+tm;
        total_marks += marks;
    }

    void updateMarks() {
        total_marks -= marks;
        marks        = cm+tm;
        total_marks += marks;
    }
    void setCodingMarks(int x)  {cm = x; updateMarks();}
    void setTracingMarks(int x) {tm = x; updateMarks();}

    void individualDetail() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Coding Marks: " + cm);
        System.out.println("Tracing Marks: " + tm);
        marks = cm+tm;
        if (marks < 50) {
            System.out.println(name+" has failed with "+marks+" marks");
        }
        else {
            System.out.println(name+" has passed with "+marks+" marks");
        }
    }
}
