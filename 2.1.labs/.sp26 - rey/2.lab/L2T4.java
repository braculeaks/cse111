public class L2T4 {
    public static void main(String[]args) {
        CellPhone phone1 = new CellPhone();
        phone1.printDetails();
        phone1.model ="Nokia 1100";
        System.out.println("1##################");
        phone1.storeContact("Joy - 01834");
        System.out.println("===================");
        phone1.printDetails();
        System.out.println("2##################");
        phone1.storeContact("Toya - 01334");
        phone1.storeContact("Aayan - 01135");
        System.out.println("===================");
        phone1.printDetails();
        System.out.println("3##################");
        phone1.storeContact("Sani - 01441");
        System.out.println("===================");
        phone1.printDetails(); 
    }
}


/*

Phone Model unknown
Contacts Stored 0
1##################
Contact Stored
===================
Phone Model Nokia 1100
Contacts Stored 1
Stored Contacts:
Joy - 01834
2##################
Contact Stored
Contact Stored
===================
Phone Model Nokia 1100
Contacts Stored 3
Stored Contacts:
Joy - 01834
Toya - 01334
Aayan - 01135
3##################
Memory full. New contact can't be
stored.
===================
Phone Model Nokia 1100
Contacts Stored 3
Stored Contacts:
Joy - 01834
Toya - 01334
Aayan - 01135


*/