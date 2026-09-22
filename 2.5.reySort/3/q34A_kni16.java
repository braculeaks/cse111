public class q34A_kni16{
    public static void main(String args[]){
        BankAccount2 acc1 = new BankAccount2();
        System.out.println("-----1-----");
        acc1.printDetails();
        System.out.println("-----2-----");
        BankAccount2 acc2 = new BankAccount2(5779,"Student");
        System.out.println("-----3-----");
        acc2.printDetails();
    }
}


/*

-----1-----
Account No: 0
Type: Not Set
-----2-----
Bank account is created
-----3-----
Account No: 5779
Type: Student

 */