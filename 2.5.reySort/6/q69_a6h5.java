public class q69_a6h5 {
    public static void main (String args[]){
        CSEStudent.details();
        System.out.println("1--------------");
        CSEStudent s1 = new CSEStudent("Bob", 23);
        s1.info();
        System.out.println("2--------------");
        CSEStudent s2 = new CSEStudent("Don", 33);
        s2.info();
        System.out.println("3--------------");
        s1.addLabBasedCourse("CSE220");
        s1.addLabBasedCourse("CSE221");
        System.out.println("4--------------");
        s1.info();
        System.out.println("5--------------");
        CSEStudent.details();
        System.out.println("6--------------");
        s1.addLabBasedCourse("CSE230");
        System.out.println("7--------------");
        s1.info();
        System.out.println("8--------------");
        s2.addLabBasedCourse("CSE110");
        s2.info();
    }
}

class Student {
    public String name;
    public int id;
    public String courses = "";
    
    public Student(String n, int i){
        name = n;
        id = i;
    }
    
    public void info(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Courses: "+courses);
    }
}

class CSEStudent extends Student{
    static int count = 0;
    static String [] course = {"CSE110", "CSE111", "CSE220", "CSE221"};    // probably did "not"
    
    CSEStudent(String n, int i){
        super(n,i);
        count++;
    }

    public static void details(){
        System.out.println("Total CSE Students: " + count);
        System.out.println("Available Lab Based Courses:");
        System.out.println("CSE110 CSE111 CSE220 CSE221");
    }

    public static int find(String c) {
        for(int i = 0; i < 4; i++){
            if(c.equals(course[i])){
                return i;
            }
        }
        return -1;
    }

    public void addLabBasedCourse(String c){
        int k = find(c);
        if (k == -1)
            System.out.println("It is not a lab based course!");
        else 
            courses = courses + c + " ";
    }

    @Override
    public void info(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Courses: " + courses);
    }
}


/*

Exercise

Total CSE Students: 0
Available Lab Based Courses: 
CSE110 CSE111 CSE220 CSE221 
1--------------
Name: Bob
ID: 23
Courses: 
2--------------
Name: Don
ID: 33
Courses: 
3--------------
4--------------
Name: Bob
ID: 23
Courses: CSE220 CSE221 
5--------------
Total CSE Students: 2
Available Lab Based Courses: 
CSE110 CSE111 CSE220 CSE221 
6--------------
It is not a lab based course!
7--------------
Name: Bob
ID: 23
Courses: CSE220 CSE221 
8--------------
Name: Don
ID: 33
Courses: CSE110

 */