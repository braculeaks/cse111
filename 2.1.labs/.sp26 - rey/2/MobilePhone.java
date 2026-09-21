public class MobilePhone {      /* a2q4 */
    public int cN = 0;
    public String[] contactNames   = null;
    public    int[] contactNumbers = null;

    public void setContactCapacity(int n) {
        this.contactNames   = new String[n];
        this.contactNumbers = new    int[n];
    }

    public void details() {
        System.out.println("Total Contacts: " + cN);
        System.out.println("Contact List: ");
            for (int i = 0; i < cN; i++) {
                System.out.println(contactNames[i] + ":" + contactNumbers[i]);
            }
    }

    public void addContact(String pName, int pNumber) 
    {
        if (cN < contactNames.length) {
            contactNames  [cN] = pName;
            contactNumbers[cN] = pNumber;
            cN++;

            System.out.println("The contact of " + pName + " is added.");
        }
        else {
            System.out.println("Storage Full!!");
        }
    }

    public void makeCall(int pNumber) {
        int k = -1;
        for (int i = 0; i < cN; i++) {
            if (contactNumbers[i] == pNumber) {
                k = i;
                break;
            }
        }

        if (k == -1)    System.out.println("Calling " + pNumber         + " . . .");
        else            System.out.println("Calling " + contactNames[k] + " . . .");
    }
}
