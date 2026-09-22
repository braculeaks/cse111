public class Student2 {
    
    String name;
    String code;
    private double marks = 0.0;

    Student2 (String name,  String code){
        this.name = name;
        this.code = code;  
    }
    
    public void viewDetails(){
        System.out.println(name);
        System.out.println("Course: " + code);
        System.out.println("Marks: " + marks);
    }

    public void setMark(double marks) 
    {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
            System.out.println("setMark(): " + marks);
        }
        else
            System.out.println("setMark(): " + marks + " is invalid! [0-100]");
    }
}