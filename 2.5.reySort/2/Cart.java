public class Cart {   // q29
    
    String [] name = new String[3];
    int price = 0;
    int itemNum = 0;

    public void info()
    {
        System.out.println("Cart capacity: 3");
        System.out.println("Total Item: " + itemNum);
        System.out.println("Total Price: " + price + " Taka");
        System.out.println("Item List: ");
        for(int i = 0; i < itemNum; i++)
        {
            System.out.print(name[i] + " ");
        }
        System.out.println();

    }
    public void addItem(String item, int p)
    {
        if(itemNum >= 3)
        {
            System.out.println("Cart is full");
            return;
        }
        name[itemNum] = item;
        price += p;
        System.out.println(item + " is added to cart.");
        itemNum++;
    }
}
