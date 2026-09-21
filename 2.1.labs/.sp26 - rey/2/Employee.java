public class Employee {         /* a2q3 */
    public String name = null;
    public String designation = null;
    public double salary = 0.0;

    public void newEmployee(String pName) {
        this.name = pName;
        this.designation = "junior";
        this.salary = 30*1000;
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary + " Tk");
        System.out.println("Employee Designation: " + designation);
    }

    public void calculateTax() {
             if (salary > 50*1000)  System.out.println(name + " Tax Amount: " + salary*0.3 + " Tk");
        else if (salary > 30*1000)  System.out.println(name + " Tax Amount: " + salary*0.1 + " Tk");
        else                        System.out.println("No need to pay tax");
    }
    public void promoteEmployee(String pDesignation) {
        this.designation = pDesignation;
    
             if (pDesignation.equals("senior"))     this.salary = 30*1000 + 25*1000;
        else if (pDesignation.equals("lead"))       this.salary = 30*1000 + 50*1000;
        else if (pDesignation.equals("manager"))    this.salary = 30*1000 + 75*1000;

        System.out.println(name + " has been promoted to " + designation);
        System.out.println("New Salary: " + salary + " Tk");
    }
}