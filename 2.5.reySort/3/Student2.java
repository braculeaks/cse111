public class Student2 {     // q31
    String name;
    String dept = "CSE";
    double cgpa = 0.0;

    public void updateInfo(String n){
        name = n;
    }
    public void updateInfo(String n, String sub){
        name = n;
        dept = sub;
    }
    public void updateInfo(String n, String sub, double cg){
        name = n;
        dept = sub;
        cgpa = cg;
    }
    public void updateInfo(String n, double cg, String sub) {
        this.updateInfo(n, sub, cg);
    }
    public void details()
    {
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("CGPA: " + cgpa);
    }
}
