class Employee {
    public int pin = 100;
    public static String call()      {return "Employee Calling...";}
    public        String role()      {return "General";}
    public        String point()     {return call() + this.pin;}
    public        String toString()  {return point() + "In toString method...";}
}

class Engineer extends Employee {
    public int pin = 50;
    public static String call()  { return "Engineer Calling..."; }
    public        String role()  { return "Standard"; }
    public        String point() {
        work();
        System.out.println(super.point());
        return "Here for fun ";           
    }

    public void work() {
        if (this instanceof Employee) {
            System.out.println("Working slow..." + (Object)this);
        }
        else if (this instanceof JuniorSoftwareEngineer) {
            System.out.println("Working faster..." + this);
        }
    }

    public void getInfo() {
        System.out.println(super.role() +" "+role() + " " + pin);
    }
}

class ElectricalEngineer extends Engineer {
   public static String call()      { return "ElectricalEngineer Calling..."; }
   public        String role()      { return "Medium"; }
   public        String toString()  { return pin + role() + (((Employee)this).pin); }
}

class SoftwareEngineer extends Engineer {
   public int pin = 200;
   public String role() { return "Intermediary"; }
   public   void work() { System.out.println("Extreme work..." + role()); }
}
class JuniorSoftwareEngineer extends SoftwareEngineer {
   public int pin = 30;
   public String role() {return "Starting";}
}





public class mau12 {
    public static void main(String[] args) {
        SoftwareEngineer emp1 = new JuniorSoftwareEngineer();
        Employee emp2 = new ElectricalEngineer();
        Employee emp3 = new SoftwareEngineer();

        ((Engineer)emp3).getInfo();
        System.out.println(((ElectricalEngineer)emp1).pin);
        ((Engineer)emp1).work();
        System.out.println((Employee)emp1);
        System.out.println(emp2.point());
    }
}