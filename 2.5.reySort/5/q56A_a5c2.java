public class q56A_a5c2 {
    public static void main(String[] args) {
        System.out.println("Total Students: " + Student4.total_students);
        System.out.println("Average Marks: " + Student4.averageMarks());
        System.out.println("----------1----------");
        Student4 mike = new Student4("Mike");
        mike.setCodingMarks(35);
        mike.setTracingMarks(10);
        mike.individualDetail();
        System.out.println("----------2----------");
        System.out.println("Total Students: " + Student4.total_students);
        System.out.println("Average Marks: " + Student4.averageMarks());
        System.out.println("----------3----------");
        Student4 eleven = new Student4("Eleven", 70, 20);
        eleven.individualDetail();
        System.out.println("----------4----------");
        Student4 will = new Student4("Will");
        will.setCodingMarks(51);
        will.individualDetail();
        System.out.println("----------5----------");
        System.out.println("Total Students: " + Student4.total_students);
        System.out.println("Average Marks: " + Student4.averageMarks());
    }
}


/*

Note: A Student needs at least 50 marks to pass.

Total Students: 0
Average Marks: 0.0
----------1----------
Name: Mike
ID: 1
Coding Marks: 35
Tracing Marks: 10
Mike has failed with 45 marks
----------2----------
Total Students: 1
Average Marks: 45.0
----------3----------
Name: Eleven
ID: 2
Coding Marks: 70
Tracing Marks: 20
Eleven has passed with 90 marks
----------4----------
Name: Will
ID: 3
Coding Marks: 51
Tracing Marks: 0
Will has passed with 51 marks
----------5----------
Total Students: 3
Average Marks: 62.0

*/