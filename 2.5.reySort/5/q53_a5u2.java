public class q53_a5u2 {        // Kora Hoy nai
    public static void main(String[] args) {
        Student3.printDetails();
        System.out.println("--------------------");
        Student3 mikasa = new Student3("Mikasa", 3.75);
        mikasa.individualDetail();
        System.out.println("--------------------");
        Student3.printDetails();
        System.out.println("--------------------");
        Student3 harry = new Student3("Harry", 2.5, "Charms");
        harry.individualDetail();
        System.out.println("--------------------");
        Student3.printDetails();
        System.out.println("--------------------");
        Student3 levi = Student3.createStudent("Levi", 3.33);
        levi.individualDetail();
        System.out.println("--------------------");
        Student3.printDetails();
    }
}


/*

Total Student(s): 0
CSE Student(s): 0
Other Department Student(s): 0
--------------------
ID: 1
Name: Mikasa
CGPA: 3.75
Department: CSE
--------------------
Total Student(s): 1
CSE Student(s): 1
Other Department Student(s): 0
--------------------
ID: 2
Name: Harry
CGPA: 2.5
Department: Charms
--------------------
Total Student(s): 2
CSE Student(s): 1
Other Department Student(s): 1
--------------------
ID: 3
Name: Levi
CGPA: 3.33
Department: CSE
--------------------
Total Student(s): 3
CSE Student(s): 2
Other Department Student(s): 1

 */