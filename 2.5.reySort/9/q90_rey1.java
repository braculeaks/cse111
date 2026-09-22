abstract class Animal {
    public String species;
    
    public Animal(String species) {
        this.species = species;
    }

    // Concrete method: All animals sleep the same way
    public void sleep() {
        System.out.println("The " + species + " is sleeping peacefully...");
    }

    // ABSTRACT methods: Subclasses MUST define these behaviors
    public abstract void makeSound();
    public abstract void performAction();
}

public class q90_rey1 {
    public static void main(String[] args) {
        // Animal a1 = new Animal("idk");      // ERROR: Cannot instantiate abstract class
        
        Lion simba = new Lion("Simba");
        Eagle freedom = new Eagle("Freedom");

        System.out.println("--- 1 ---");
        simba.makeSound();
        simba.performAction();
        simba.sleep();

        System.out.println("--- 1 ---");
        freedom.makeSound();
        freedom.performAction();
        freedom.sleep();
    }
}



/*

--- 0 ---
The Lion Roars!
The Lion hunts on the Savannah.
The Lion is sleeping peacefully...
--- 1 ---
The Eagle Screeches!
The Eagle soars through the sky.
The Eagle is sleeping peacefully...

 */
