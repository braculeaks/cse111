public class Course {           // q24
    String name;
    String code;
    int credit;

    public void createCourse(String n, String c, int cr)
    {
        name = n;
        code = c;
        credit = cr;
    }

    public void displayCourse()
    {
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Course Credit: " + credit);
    }

    public void updateCourse(String n, String c, int cr)
    {
        name = n;
        code = c;
        credit = cr;
    }

}
