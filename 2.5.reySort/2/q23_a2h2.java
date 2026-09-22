public class q23_a2h2 {
    public static void main(String [] args){
        Assignment as1 = new Assignment();
        as1.printDetails();
        System.out.println("1---------------");
        as1.tasks = 11;
        as1.difficulty = "Moderate";
        as1.submission = true;
        as1.printDetails();
        System.out.println("2---------------");
        System.out.println(as1.makeOptional());
        System.out.println("3---------------");
        as1.printDetails();
        System.out.println("4---------------");
        Assignment as2 = new Assignment();
        as2.tasks = 12;
        as2.difficulty = "Hard";
        as2.submission = false;
        as2.printDetails();
        System.out.println("5---------------");
        System.out.println(as2.makeOptional());
    }
}

/*

Number of tasks: 0
Difficulty level: null
Submission required: false
1---------------
Number of tasks: 11
Difficulty level: Moderate
Submission required: true
2---------------
Assignment will not require submission
3---------------
Number of tasks: 11
Difficulty level: Moderate
Submission required: false
4---------------
Number of tasks: 12
Difficulty level: Hard
Submission required: false
5---------------
Submission is already not required

 */