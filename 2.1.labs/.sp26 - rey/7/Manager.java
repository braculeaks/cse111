public class Manager extends Employee {             // a7q5
    double bonus;
    double fs;

    Manager(String n, int bs, int wh, int b) {
        super(n, bs, wh);
        bonus = b;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus: " + bonus + " %");
        System.out.println("Final Salary: $" + fs);
    }

    void calculateSalary() {
        fs = super.getBaseSalary();
        if (super.getHoursWorked() > 45) {
            fs *= (1+(bonus/100));
        }
    }

    void requestIncrement(int m) {
        if (super.getHoursWorked() > 100) {
            setBaseSalary(getBaseSalary() + m);
            System.out.println("$" + m + " Increment approved.");
        }
        else if (super.getHoursWorked() > 80) {
            setBaseSalary(getBaseSalary() + (m/2));
            System.out.println("$" + (m/2) + " Increment approved.");
        }
        else {
            System.out.println("Increment denied.");
        }
    }
}


class Developer extends Employee {
    double fs;
    String lang;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Language: " + lang);
        System.out.println("Final Salary: $" + fs);
    }

    Developer(String n, int bs, int wh, String l) {
        super(n, bs, wh);
        lang = l;
    }

    void calculateSalary() {
        fs = super.getBaseSalary();
        if (lang.equals("Java")) {
            fs += 700;
        }
    }
}