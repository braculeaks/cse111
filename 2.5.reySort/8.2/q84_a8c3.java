class Character {
    public String name;
    public int level;
    public Character(String name, int level) {
        this.name = name;
        this.level = level;
    }
    public void specialMove() {
        System.out.println("Character uses a generic move.");
    }

    
    // Override the .equals() method
}



public class a8c3 {
    public static void main(String[] args) {
        Character c1 = new Paladin("Arthur", 10);
        Character c2 = new Mage("Merlin", 12);
        Character c3 = new Warrior("Leon", 10); 
        c1.specialMove();
        c2.specialMove();
        c3.specialMove(); +
        if (c1 instanceof Paladin) {
            Paladin p = (Paladin) c1;
            p.specialMove();
        } 
        Warrior w1 = new Warrior("Leon", 10);
        System.out.println("c3 equals w1? " + c3.equals(w1));
        Mage m1 = new Mage("Merlin", 15);
        System.out.println("c2 equals m1? " + c2.equals(m1));
    }
}


/*

Design a set of classes for a Fantasy Game Character System. 
There is a parent class called Character. From it, there are two different child classes: Warrior and Mage. 
Additionally, there is a subclass called Paladin that extends Warrior.
Each character has:
    name (String)
    level (int)
Lastly, you need to Override the .equals() method inside the parent class

Arthur unleashes a holy strike!
Merlin casts a powerful fireball!
Leon performs a heavy sword slash!
Arthur unleashes a holy strike!
c3 equals w1? true
c2 equals m1? false

 */