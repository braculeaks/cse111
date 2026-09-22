public class Teacher {          // q45C
    String name;
    String abb;
    Course [] course = new Course[5];
    int count = 0;

    Teacher(String n, String s){
        name = n;
        abb = s;
        System.out.println("A new teacher has been created");
    }
    public void addCourse(Course c){
        course[count] = c;
        count++;
    }
    public void printDetail(){
        System.err.println("Name: "+name);
        System.err.println("Initial: "+abb);
        System.err.println("List of courses:");
        for(int i = 0; i < count; i++)
            System.err.println(course[i].getName());
    }
}

class Course {
    private String name;

    Course(String n){
        name = n;
    }

    String getName() {return name;}
}
