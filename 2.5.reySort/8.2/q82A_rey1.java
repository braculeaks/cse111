public class q82A_rey1 {
    
    
    
    
    
    public static void main(String[] args){
        Student s = new Student();
        CSEStudent cs = new CSEStudent();
        CSE111Student cs111 = new CSE111Student();
        System.out.println(s.msg);
        System.out.println(cs.msg);
        System.out.println(cs111.msg);
    }
}






class Student {
    String msg = "I love BU";
    
    Student() {}
}





class CSEStudent extends Student {
    String msg = "I want to transfer to CSE";       // Variable Hiding
    
    CSEStudent() {}
}

class CSE111Student extends CSEStudent {
    String msg = "I love Java Programming";         // Variable Hiding
    
    CSE111Student() {}
}


/*

Introducing: Variable Overloading/Hiding

                             helpful tracing columns
                            --------------------------

I love BU                           s.msg
I want to transfer to CSE          cs.msg
I love Java Programming        cse111.msg

 */