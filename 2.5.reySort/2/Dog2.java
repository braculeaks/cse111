public class Dog2               // q28
{
    String name = null;
    String color = null;

    public void changeName(String n) 
    {
        name = n;
    }
    public void changeColor(String c)
    {
        color = c;
        if (name == null) System.out.println("This dog is " + c);
        else              System.out.println(name + " is " + c);
    }
    public String bark() {
        if (name == null) {
            if (color == null) return "A dog is barking";
            else               return color + " dog is barking";
        }
        else {
            if (color == null) return name + " is barking";
            else               return name + " the " + color + " dog is barking";
        }
    }
}
