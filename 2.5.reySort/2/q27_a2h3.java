public class q27_a2h3 {
    public static void main(String[] args){
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        emp1.newEmployee("Harry Potter");
        emp2.newEmployee("Hermione Granger");
        emp3.newEmployee("Ron Weasley");
        System.out.println("1 ==========");
        emp1.displayInfo();
        System.out.println("2 ==========");
        emp2.displayInfo();
        System.out.println("3 ==========");
        emp3.displayInfo();
        System.out.println("4 ==========");
        emp1.calculateTax();
        System.out.println("5 ==========");
        emp1.promoteEmployee("lead");
        System.out.println("6 ==========");
        emp1.calculateTax();
        System.out.println("7 ==========");
        emp1.displayInfo();
        System.out.println("8 ==========");
        emp3.promoteEmployee("manager");
        System.out.println("9 ==========");
        emp3.calculateTax();
        System.out.println("10 ==========");
        emp3.displayInfo();
    }
}


/*

Also Check instructions from pdf

1 ==========
Employee Name: Harry Potter
Employee Salary: 30000.0 Tk
Employee Designation: junior
2 ==========
Employee Name: Hermione Granger
Employee Salary: 30000.0 Tk
Employee Designation: junior
3 ==========
Employee Name: Ron Weasley
Employee Salary: 30000.0 Tk
Employee Designation: junior
4 ==========
No need to pay tax
5 ==========
Harry Potter has been promoted to lead
New Salary: 80000.00 Tk
6 ==========
Harry Potter Tax Amount: 24000.0 Tk
7 ==========
Employee Name: Harry Potter
Employee Salary: 80000.0 Tk
Employee Designation: lead
8 ==========
Ron Weasley has been promoted to manager
New Salary: 105000.00 Tk
9 ==========
Ron Weasley Tax Amount: 31500.0 Tk
10 ==========
Employee Name: Ron Weasley
Employee Salary: 105000.0 Tk
Employee Designation: manager

 */