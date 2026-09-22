public class Dog {          // q28
    
    String name = "A dog";
    String color = null;

    public void changeName(String n)
    {
        name = n;
    }
    public void changeColor(String c)
    {
        color = c;
        if (name.equals("A dog")) System.out.println("This dog is " + color);
        else                      System.out.println(name + " is " + color);
    }
    public String bark()
    {
        if (color == null)            return name + " is barking";
        else 
        {
            if (name.equals("A dog")) return color + " dog is barking";
            else                      return name + " the " + color + " dog is barking";
        }
    }
}
