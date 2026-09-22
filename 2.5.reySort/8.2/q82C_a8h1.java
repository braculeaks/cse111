public class q82C_a8h1 {
    public static void printShout(Student s){
        System.out.println("------------------");
        System.out.println(s.msg);          // Student.msg      --> Student.msg
        System.out.println(s.shout());      // Student.shout()  --> CSE111Student.shout()
        
            // s.msg   --> compiler decides @ compiler-time which variable.
            // shout() --> "Dynamically" calls lates @overridden version of "shout()" @ runtime
    }
    public static void main(String[] args){
        Student s = new Student();                      // @100
        CSEStudent cs = new CSEStudent();               // @200
        CSE111Student cs111 = new CSE111Student();      // @300
        
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

    @Override
    String shout() {
        return msg;
    }
}

class CSE111Student extends CSEStudent {
    String msg = "I love Java Programming";         // Variable Hiding
    
    CSE111Student() {}

    @Override
    String shout() {
        return msg;
    }
}


/*

What is overloading?
- If we cast a children (CSE111Student) into parent (CSEStudent or Student)
    - Student s = (Student) cse111;
    - s.shout();
        - this will call the latest @overridden version of that function


Introducing: Method "Overloading" v/s Variable "Hiding"
Introducing: RunTime PolyMorphism


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
I want to transfer to CSE       line 17         s.shout()   (CSEStudent)
------------------
I love BU                       line 18         s.msg       (CSE111Student)
I love Java Programming         line 18         s.shout()   (CSE111Student)


s.msg
s.shout()
line14/15/16
these 3 are only for help purposes, don't print them




CSE111Student memory structure
   - Student.msg
   - CSEStudent.msg
   - CSE111Student.msg
   -
   - shout()        - this will call the latest @overridden version of that function
   - super.shout()

CSE111Student@300
   - shout() --> "I love Java Programming"

CSEStudent@200
   - shout() --> "I want to transfer to CSE"

Student@100
   - shout() --> "I love BU"

 */