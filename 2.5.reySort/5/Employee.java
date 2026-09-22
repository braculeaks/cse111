public class Employee {
    static int total = 0;
    static Employee[] arr = new Employee[100];
    static int c = 0;

    static void allEmployeeInfo() {
        System.out.println("Total Employee: " + total);
        System.out.println("Employee List: ");
        for (int i = 0; i < c; i++) {
            arr[i].details();
        }
    }

    static Employee createEmployee(String n, int id){
        Employee sm1 = new Employee(n, id);
        return sm1;
    }

    String name;
    int id;

    Employee(String n, int k) {
        name = n;
        id = k;
        total++;

        arr[c] = this;
        c++;
    }
    
    void details() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
