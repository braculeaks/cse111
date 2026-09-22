public class Department {       // q41
    String dep;
    int studs;

    Department(String n, int c) {
        dep = n;
        studs = c;
    }
    public void mergeStudents(Department d){
        System.out.println("Students of "+d.dep+" are merged with students of "+dep);
        studs += d.studs;
    }
    public void info() {
        System.out.println("Name: " + dep);
        System.out.println("Total Students: " + studs);
    }
    public void addStudents(int arr[]){
        for(int i = 0; i < arr.length; i++){
            studs += arr[i];
            arr[i] = 0;
        }
    }
}
