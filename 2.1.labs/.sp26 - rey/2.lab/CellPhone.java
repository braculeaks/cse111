public class CellPhone {                /* L2T4 */
    public String model = "unknown";

    public int cN = 0;
    public String[] contacts = new String[3];

    public void printDetails() {
        System.out.println("Phone Model " + model);
        System.out.println("Contacts Stored " + cN);
        
        if (cN > 0) {
            System.out.println("Stored Contacts: ");
            for (int i = 0; i < cN; i++) {
                System.out.println(contacts[i]);
            }
        }
    }

    public void storeContact(String cont) {
        if (cN < 3) {
            this.contacts[this.cN++] = cont;
            System.out.println("Contact Stored");
        }
        else {
            System.out.println("Memory full. New contact can't be stored.");
        }
    }
}
