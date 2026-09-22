public class Student {
    static int total_students = 0;
    static Student[] arr = new Student[5];

    static double averageMarks() 
    {
        double sum = 0;
        for (int i = 0; i < total_students; i++) 
        {
            sum += arr[i].getTotalMarks();
        }
        
        if (total_students == 0) return 0.0;
        else                     return sum / total_students;
    }

    String name;
    int ID;
    int cm = 0;
    int tm = 0;

    Student (String n) {
        int k = total_students;
        if (k < 5) 
        {
            arr[k] = this;
            k++;
            ID = k;
            name = n;

            total_students = k;
        }
    }
    Student (String n, int c, int t) {
        this(n);
        cm = c;
        tm = t;
    }

    void setCodingMarks(int m) {cm = m;}
    void setTracingMarks(int m){tm = m;}
    int  getTotalMarks() {return cm+tm;}

    void individualDetail() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Coding Marks: " + cm);
        System.out.println("Tracing Marks: " + tm);
        if (cm+tm < 50) {
            System.out.println(name + " has failed with " + (cm+tm) + " marks");
        }
        else {
            System.out.println(name + " has passed with " + (cm+tm) + " marks");
        }
    }
}
