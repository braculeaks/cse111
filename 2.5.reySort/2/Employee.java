public class Employee {     // q27
    
    String name;
    double salary = 30000.0;
    String desig = "junior";
    double tax = 0.0;

    public void newEmployee(String n)
    {
        name = n;
    }

    public void displayInfo()
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary + "Tk");
        System.out.println("Employee Designation: " + desig);
    }

    public void promoteEmployee(String d)
    {
        desig = d;

             if (desig.equals("senior"))  salary = 55000.0;
        else if (desig.equals("lead"))    salary = 80000.0;
        else if (desig.equals("manager")) salary = 105000.0;

        System.out.println(name + " has been promoted to " + d);
        System.out.println("New Salary: " + salary + " Tk");

    }

    public void calculateTax()
    {
        if (salary <= 30000)
        {
            System.out.println("No need to pay tax");
        }

        else if (salary > 50000.0)
        {
            tax = salary * 0.3;
            System.out.println(name + " Tax Amount: " + tax + "Tk");

        }

        else if (salary > 30000.0 && salary <= 50000.0)
        {
            tax = salary * 0.1;
            System.out.println(name + " Tax Amount: " + tax + "Tk");
        }
    }
}
