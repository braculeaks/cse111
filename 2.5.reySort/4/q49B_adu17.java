public class q49B_adu17 {           // Kora Hoy Nai
    public static void main(String[] args) {
        Vaccine astra = new Vaccine("AstraZeneca", "UK", 60);
        Vaccine modr = new Vaccine("Moderna", "UK", 30);
        Vaccine sin = new Vaccine("Sinopharm", "China", 30);
        Person p1 = new Person("Bob", 21, "Student");
        System.out.println("1=================");
        p1.pushVaccine(astra);
        System.out.println("2=================");
        p1.showDetail();
        System.out.println("3=================");
        p1.pushVaccine(sin, "2nd Dose");
        System.out.println("4=================");
        p1.pushVaccine(astra, "2nd Dose");
        System.out.println("5=================");
        p1.showDetail();
        System.out.println("6=================");
        p1.pushVaccine(astra, "2nd Dose");
        System.out.println("7=================");
        p1.showDetail();
        System.out.println("8=================");
        Person p2 = new Person("Carol", 23, "Actor");
        System.out.println("9=================");
        p2.pushVaccine(sin);
        System.out.println("10=================");
        Person p3 = new Person("David", 34);
        System.out.println("11=================");
        p3.pushVaccine(modr, "2nd Dose");
        System.out.println("12=================");
        p3.pushVaccine(modr, "1st Dose");
        System.out.println("13=================");
        p3.showDetail();
        System.out.println("14=================");
        p3.pushVaccine(modr, "2nd Dose");
    }
}


/*

Students will get vaccines on a priority basis.
So, age doesn’t matter for students.
All attributes of Vaccine class should be Private.

1=================
1st dose done for Bob
2=================
Name: Bob, Age: 21, Type: Student
Vaccine name: AstraZeneca
1st dose: Given
2nd dose: Please come after 60 days
3=================
Sorry Bob, you can't take 2 different
vaccines
4=================
2nd dose done for Bob
5=================
Name: Bob, Age: 21, Type: Student
Vaccine name: AstraZeneca
1st dose: Given
2nd dose: Given
6=================
Sorry Bob, you already received both doses.
7=================
Name: Bob, Age: 21, Type: Student
Vaccine name: AstraZeneca
1st dose: Given
2nd dose: Given
8=================
9=================
Sorry Carol, Minimum age for taking
vaccines is 25 years now.
10=================
11=================
Sorry David, invalid dose request.
12=================
1st dose done for David
13=================
Name: David, Age: 34, Type: General Citizen
Vaccine name: Moderna
1st dose: Given
2nd dose: Please come after 30 days
14=================
2nd dose done for David

 */
