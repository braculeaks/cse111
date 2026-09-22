public class one {    // FileName: zero.java
    public static void main(String[] args)
    {
        // A Copy / Object / Instance
        Student s1 = new Student();
        s1.fn(); 
    }
}



/* This is BluePrint */
class Student {
    String name    = "ayiham";
    int    ID      = 1000058970;
    String uniName = "IUT";

    void fn() {
        System.out.println("Hello World");
        System.out.println(name);
        System.out.println(ID);
        System.out.println(uniName);
    }
}