
public class Member {           // q48B_adu14
    private String name;        // 1 piece per object/instance
    private String branch;
    private boolean isActive = false;

    public String getName() {return name;}
    public String getBranch() {return branch;}
    public boolean getIsActive() {return isActive;}


    Member(String s, String b) {
        name = s;
        branch = b;  
    }

    public void showDetails() {
        System.out.println("Member Name: "+ name);
        System.out.println("Home Branch: "+ branch);
        System.out.println("Membership Active? "+isActive);
    }
    
    public void activateMembership() {
        isActive = true;
    }

    public void updateBranch(String s) {
        branch = s;
    }
}


class Gym {
    String branch;
    int capacity = 2;
    int count = 0;
    Member [] checked;
    
    Gym (String b){
        branch = b;
        checked = new Member[capacity];
    }
    Gym (String b, int n){
        branch = b;
        capacity  = n;
        checked = new Member[capacity];
    }
    
    public void checkIn(){
        System.out.println("No members given");
    }

    public void checkIn(Member a){
        boolean k = branch.equals(a.getBranch());
        if (k == false)
            System.out.println("You are at the wrong branch!");
        else {
            if (a.getIsActive() == false)
                System.out.println("Your membership is inactive!");
            else {
                if (count < capacity){
                    System.out.println(a.getName() +" checked in");
                    checked[count] = a;
                    count ++;
                }
                else 
                    System.out.println("Gym is full!");
            }
        }
    }

    public void checkIn(Member a, Member b){
        checkIn(a);
        checkIn(b);
    }

    public void showDetails(){
        System.out.println("Gym Branch: " + branch);
        System.out.println("Members checked: "+count+" (Max: "+capacity+")");
        if (count == 0) System.out.println("No members given");
        else {
            System.out.println("Members Inside: ");
            for (int i = 0; i < count; i++){
                System.out.println("-----------");
                checked[i].showDetails();
            }        
        }
    }
}