public class Reader {                       /* a3q3 */
    public String name = "New user";
    public int capacity = 2;
    public int b = 0;
    public String[] reading = new String[2];

    Reader(String name, int cap) {
        this.name = name;
        this.capacity = cap;
        this.reading = new String[cap];

        System.out.println("A new reader is created!");
    }

    Reader(String name) {
        this(name, 2);
    }

    void readerInfo() {
        System.out.println("Name: "+this.name);
        System.out.println("Capacity: "+this.capacity);
        System.out.println("Books:");
        if (b == 0) {
            System.out.println("No books added yet");
        }
        else {
            for (int i = 0; i < b; i++) {
                System.out.println("Book " + (i+1) + ": " + reading[i]);
            }
        }
    }

    void addBook(String S) {
        if (b >= capacity) {
            System.out.println("No more capacity");
        }
        else {
            reading[b++] = S;
        }
    }

    void updateCapacity(int x) {
        String[] newArr = new String[x];

        int i = 0;
        while(true) {
            if (i >= b) break;
            if (i >= x) break;
            newArr[i] = this.reading[i];
            i++;
        }
        this.b = i;
        this.capacity = x;
        this.reading = newArr;

        System.out.println("Capacity has changed to "+this.capacity);
    }
}