public class q48B_adu14  {
    public static void main(String[] args) {
        Member m1 = new Member("Luffy", "Dressrosa");
        System.out.println("1===============");
        Member m2 = new Member("Zoro", "Wano");
        Member m3 = new Member("Jimbe", "Dressrosa");
        m1.showDetails();
        m2.showDetails();
        System.out.println("2===============");
        m3.showDetails();
        System.out.println("3===============");
        Gym g1 = new Gym("Dressrosa");
        Gym g2 = new Gym("Wano", 5);
        g1.showDetails();
        g2.showDetails();
        System.out.println("4===============");
        m2.activateMembership();
        m3.activateMembership();
        System.out.println("5===============");
        m2.showDetails();
        m3.showDetails();
        System.out.println("6===============");
        g1.checkIn();
        System.out.println("7===============");
        g1.checkIn(m1, m2);
        System.out.println("8===============");
        m1.activateMembership();
        m2.updateBranch("Dressrosa");
        m1.showDetails();
        m2.showDetails();
        System.out.println("9===============");
        g1.checkIn(m1);
        g1.checkIn(m2, m3);
        System.out.println("10===============");
        g1.showDetails();
    }
}


/*

- You may assume that to access the gym, a member must have an active membership card, and his/her home branch must match the branch of the gym.
- Additionally, the default maximum capacity of a gym is 2.
- All attributes of the member class must be private.

1===============
Member Name: Luffy
Home Branch: Dressrosa
Membership Active? false
Member Name: Zoro
Home Branch: Wano
Membership Active? false
2===============
Member Name: Jimbe
Home Branch: Dressrosa
Membership Active? false
3===============
Gym Branch: Dressrosa
Members Checked In: 0 (Max: 2)
No members inside
Gym Branch: Wano
Members Checked In: 0 (Max: 5)
No members inside
4===============
5===============
Member Name: Zoro
Home Branch: Wano
Membership Active? true
Member Name: Jimbe
Home Branch: Dressrosa
Membership Active? true
6===============
No members given
7===============
Your membership is inactive!
You are at the wrong branch!
8===============
Member Name: Luffy
Home Branch: Dressrosa
Membership Active? true
Member Name: Zoro
Home Branch: Dressrosa
Membership Active? true
9===============
Luffy checked in.
Zoro checked in.
Gym is full!
10===============
Gym Branch: Dressrosa
Members Checked In: 2 (Max: 2)
Members Inside:
-----------
Member Name: Luffy
Home Branch: Dressrosa
Membership Active? true
-----------
Member Name: Zoro
Home Branch: Dressrosa
Membership Active? true











 */