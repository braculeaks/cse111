public class Student2 {
    static int studentCount = 0;

    String name;
    int id;

    Student2(String n, int id) {
        name = n;
        this.id = id;
        studentCount++;
        System.out.println("A student is created!");
    }

    void info(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
}
