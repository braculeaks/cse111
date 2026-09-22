public class q54_kni31 {            // Kora Hoy Nai
    public static void main(String args[]){
        Employee.allEmployeeInfo();
        System.out.println("1-----------");
        Employee e1 = new Employee("Ashish", 23);
        e1.details();
        System.out.println("2-----------");
        Employee.allEmployeeInfo();
        System.out.println("3-----------");
        Employee e2 = new Employee("Nidhi", 45);
        e2.details();
        System.out.println("4-----------");
        Employee.allEmployeeInfo();
        System.out.println("5-----------");
        Employee e3 = new Employee("Ali", 65);
        e3.details();
        System.out.println("6-----------");
        Employee.allEmployeeInfo();
        System.out.println("7-----------");
        System.out.println("8-----------");
        Employee e4 = Employee.createEmployee("Joy", 13);
        e4.details();
        System.out.println("9-----------");
        Employee.allEmployeeInfo();
    }
}

/*

Total Employee: 0
Employee List: 
1-----------
Name: Ashish
ID: 23
2-----------
Total Employee: 1
Employee List: 
Name: Ashish
ID: 23
3-----------
Name: Nidhi
ID: 45
4-----------
Total Employee: 2
Employee List:
Name: Ashish
ID: 23
Name: Nidhi
ID: 45
5-----------
Name: Ali
ID: 65
6-----------
Total Employee: 3
Employee List:
Name: Ashish
ID: 23
Name: Nidhi
ID: 45
Name: Ali
ID: 65
7-----------
8-----------
Name: Joy
ID: 13
9-----------
Total Employee: 4
Employee List:
Name: Ashish
ID: 23
Name: Nidhi
ID: 45
Name: Ali
ID: 65
Name: Joy
ID: 13

 */