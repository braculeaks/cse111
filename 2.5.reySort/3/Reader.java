public class Reader {           // q38
    String name;
    int capacity;
    String [] books = new String [capacity];    // 1000
    int bCount = 0;

    public void createReader(String n, int cap)
    {
        name = n;
        capacity = cap;
        books = new String[capacity];       // 900
    }
    public void increaseCapacity(int c)
    {
        String[] books2 = new String[c];    // 1000

        // Copy (books2 <- books)
        for(int i = 0; i < bCount; i++) {
            books2[i] = books[i];
        }

        books = books2; 
        capacity = c;
        System.out.println(name + "'s capacity increased to " + c);
    }
    public void addBook(String b)
    {
        if(bCount >= capacity)
        {
            System.out.println("No more space for new book");
            return;
        }
        books[bCount] = b;
        bCount++;   
    }
    public void readerInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Books:");
        for ( int i = 0 ; i < bCount; i++) 
            System.out.println("Book " + (i+1) + ": " + books[i]);
        if (bCount == 0)
            System.out.println("No books added yet");
    }
}
