public class q60A_a6h1 {
    public static void main(String args[]){
        Animal a1 = new Animal();
        a1.legs = 2;
        System.out.println("1-------------");
        a1.details();
        System.out.println("2-------------");
        Cow c1  = new Cow();
        c1.name = "Pammy";
        c1.legs = 2;
        System.out.println("3-------------");
        System.out.println("Name: " + c1.name);
        c1.details();
        System.out.println("4-------------");
        c1.updateSound("Moo");
        System.out.println("5-------------");
        c1.details();
    }
}








class Animal {                  // Parent BluePrint
    public int legs = 4;
    public String sound = "Not defined";
    
    public void details() {
        System.out.println("Legs: "+legs);
        System.out.println("Sound: "+sound);
    }
}

class Cow extends Animal {      // Child BluePrint
    String name;
    protected String protectedShit;

    Cow() {
        super();
        System.out.println("The cow says hello!");
    }

    void updateSound(String s) {
        sound = s;
    }
}


/*

Introducing: Inheritence (1)
Introducing: super() function call

1-------------
Legs: 4
Sound: Not defined
2-------------
The cow says hello!
3-------------
Name: Pammy
Legs: 4
Sound: Not defined
4-------------
5-------------
Legs: 4
Sound: Moo

*/