public class q76_adu22 {
    public static void main(String[] args) {
        Manager neymar = new Manager("Neymar", 1000, 45, 10);
        Developer messi = new Developer("Messi", 1000, 50, "Java");
        Developer chiesa = new Developer("Chiesa", 1000, 50, "Javascript");
        neymar.calculateSalary();
        System.out.println("1.==========");
        System.out.println(neymar);
        System.out.println("2.==========");
        neymar.requestIncrement(100);
        System.out.println("3.==========");
        neymar.setHoursWorked(85);
        neymar.requestIncrement(100);
        System.out.println("4.==========");
        neymar.calculateSalary();
        System.out.println("5.==========");
        System.out.println(neymar);
        System.out.println("6.==========");
        messi.calculateSalary();
        System.out.println("7.==========");
        System.out.println(messi);
        System.out.println("8.==========");
        chiesa.calculateSalary();
        System.out.println("9.==========");
        System.out.println(chiesa);
    }
}

class Employee {
    private String name;
    private double baseSalary;
    private int hoursWorked;
    public Employee(String name, double baseSalary, int hoursWorked){
        this.name = name;
        this.baseSalary = baseSalary;
        this.hoursWorked = hoursWorked;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    @Override
    public String toString() {
        return "Name: " + name +
        "\nBase Salary: $" + baseSalary +
        "\nWork Hours: " + hoursWorked;
    }
}


/*

This one is also a7h5

1.==========
Name: Neymar
Base Salary: $1000.0
Work Hours: 45
Bonus: 10.0 %
Final Salary: $1100.0
2.==========
Increment denied.
3.==========
$50 Increment approved.
4.==========
5.==========
Name: Neymar
Base Salary: $1050.0
Work Hours: 85
Bonus: 10.0 %
Final Salary: $1155.0
6.==========
7.==========
Name: Messi
Base Salary: $1000.0
Work Hours: 50
Language: Java
Final Salary: $1700.0
8.==========
Name: Chiesa
Base Salary: $1000.0
Work Hours: 50
Language: Javascript
Final Salary: $1000.0

 */