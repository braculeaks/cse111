public class q45B_rey3 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("Alice", "CSE111");

        System.out.println("1.===========");
        s1.postFinalGrade(); 

        System.out.println("2.===========");
        s1.setMarks("quiz1", 15.0);
        s1.setMarks("quiz2", 25.0);
        s1.setMarks("lab1", 8.5);
        s1.setMarks("mid", 35.0);
        
        System.out.println("3.===========");
        s1.totalMarksNow();
        s1.postFinalGrade();

        System.out.println("4.===========");
        s1.setMarks("quiz2",  18.0);
        s1.setMarks("quiz3",  10.0);
        s1.setMarks("lab2", 7.0);
        s1.setMarks("lab3", 9.0);

        s1.totalMarksNow();
        
        s1.setMarks("mid", 25.0);
        s1.setMarks("assignment", 10.0);
        s1.setMarks("final", 35.0);
        s1.setMarks("final", -2.0);

        System.out.println("5.===========");
        s1.totalMarksNow();
        s1.setMarks("quiz3", -2.0);
        s1.setMarks("lab3", 11.0);

        System.out.println("6.===========");
        s1.postFinalGrade();
    }
}


/*

3 quiz, quiz1, quiz3, quiz3  [marks range: 0-20 each] take avg of all 3 to calculate final grade
3 lab exam, lab1, lab2, lab3 [marks range: 0-10 each] take avg of all 3 to calculate final grade
1 midTerm exam, "mid"        [marks range: 0-30]
1 final exam, "final"        [marks range: 0-40]

have a private "marks" variable

setMarks() is gonna have to match string yeah 🥴 but only these 8 strings
setMarks() should update the "marks" variable too


Alice enrolled in CSE111.
1.===========
Cannot post grade for Alice. Some assessments are still pending!
2.===========
quiz1: 15.0
25.0 is invalid for quiz2! Range: 0-20
lab1: 8.5
35.0 is invalid for mid! Range: 0-30
3.===========
CSE111 --> Alice: 7.833333333333333/100.0
Cannot post grade for Alice. Some assessments are still pending!
4.===========
quiz2: 18.0
quiz3: 10.0
lab2: 7.0
lab3: 9.0
CSE111 --> Alice: 35.166666666666664/100.0
mid: 25.0
assignment is not a valid assessment type!
final: 35.0
-2.0 is invalid for final! Range: 0-40
5.===========
CSE111 --> Alice: 79.83333333333333/100.0
-2.0 is invalid for quiz3! Range: 0-20
11.0 is invalid for lab3! Range: 0-10
6.===========
Final Grade for Alice in CSE111: 79.83333333333333 / 100.0
After adding Grace marks: 80/100

 */