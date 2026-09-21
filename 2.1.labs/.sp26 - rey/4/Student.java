public class Student {                  /* a4q3 */
    public  String name  = null;
    public  String email = null;
    private String pass  = null;
    public  String dep   = null;

    public  int ID;
    private boolean isLoggedIn = false;

    public String courses[] = new String[3];
    public int c = 0;

    public Student(String n, int ID, String d) {
        name = n;
        this.ID = ID;
        dep = d;

        System.out.println("Student object is created");
    }

    public void    setPassword(String p) {pass = p;}
    public String  getPassword()  {return pass;}
    public boolean getLogInStat() {return isLoggedIn;}
    public void       LogIn()            {isLoggedIn = true;}
    public void       LogOut()           {isLoggedIn = false;}

    public void  printDetails() {
        System.out.println("Name: " + name + " ID: " + ID);
        System.out.println("Department: " + dep);
        System.out.println("Advised Courses: ");
        for (int i = 0; i < c; i++) {
            System.out.print(courses[i] + " ");
        }
        System.out.println("");
    }
}

class Connect {
    int totalAdvisee = 0;
    Student arr[] = new Student[5];

    public Connect() {
        System.out.println("Connect is ready to use!");
    }

    public void login(Student s) {
        if (s.email == null || s.getPassword() == null) {
            System.out.println("Email and password need to be set.");
        }
        else {
            s.LogIn();
            System.out.println("Login successful");
        }
    }

    public void advising(Student s) {
        if (s.getLogInStat() == false) {
            System.out.println("Please login to advise courses!");
        }
        else {
            System.out.println("You haven't selected any courses.");
        }
    }

    public void advising(Student s, String c1, String c2, String c3, String c4) {
        if (s.getLogInStat() == false) {
            System.out.println("Please login to advise courses!");
        }
        else {
            System.out.println("You need special approval to take more than 3 courses.");
        }
    }

    public void advising(Student s, String c1, String c2, String c3) {
        arr[totalAdvisee++] = s;
        s.courses[0] = c1;
        s.courses[1] = c2;
        s.courses[2] = c3;
        s.c = 3;
        System.out.println("Advising successful!");
    }

    public void allAdviseeInfo() {
        System.out.println("Total Advisee: " + totalAdvisee);
        for (int i = 0; i < totalAdvisee; i++) {
            arr[i].printDetails();
            System.out.println("==============");
        }
    }
}