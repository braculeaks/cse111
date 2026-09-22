public class q82B_rey2 {
    public static void printShout(Student s){
        System.out.println("------------------");
        System.out.println(s.msg);
        System.out.println(s.shout());      
            // Does the compiler know @ compile-time, which function is going to be called? --> No
    }
    public static void main(String[] args){
        Student s = new Student();
        CSEStudent cs = new CSEStudent();
        CSE111Student cs111 = new CSE111Student();

        System.out.println(s.msg);
        System.out.println(cs.msg);
        System.out.println(cs111.msg);

        printShout((Student)s);
        printShout((Student)cs);
        printShout((Student)cs111);
    }
}

class Student {
    String msg = "I love BU";
    
    Student() {}

    String shout() {
        return msg;
    }
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

Introducing: Class-Type-Casting

                             helpful tracing columns
                            --------------------------

I love BU                           s.msg
I want to transfer to CSE          cs.msg
I love Java Programming        cse111.msg
------------------
I love BU                       line 16         s.msg       (Student)
I love BU                       line 16         s.shout()   (Student)
------------------
I love BU                       line 17         s.msg       (CSEStudent)
I love BU                       line 17         s.shout()   (CSEStudent)
------------------
I love BU                       line 18         s.msg       (CSE111Student)
I love BU                       line 18         s.shout()   (CSE111Student)


s.msg
s.shout()
line14/15/16
these 3 are only for help purposes, don't print them


 */