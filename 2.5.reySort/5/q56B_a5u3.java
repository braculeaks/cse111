public class q56B_a5u3 {        // Kora Hoy Nai
    public static void main(String[] args) {
        System.out.println("Cargo Capacity: " + Cargo2.capacity());
        System.out.println("1====================");
        Cargo2 a = new Cargo2("Industrial Machinery", 4.5);
        a.details();
        System.out.println("2====================");
        a.load();
        System.out.println("3====================");
        Cargo2 b = new Cargo2("Steel Ingot", 2.7);
        b.details();
        System.out.println("4====================");
        System.out.println("Cargo Capacity: " + Cargo2.capacity());
        System.out.println("5====================");
        b.load();
        System.out.println("Cargo Capacity: " + Cargo2.capacity());
        System.out.println("6====================");
        Cargo2 c = new Cargo2("Tree Trunks", 3.6);
        c.load();
        System.out.println("7====================");
        c.details();
        b.details();
        System.out.println("8====================");
        Cargo2 d = new Cargo2("Processed Goods", 1.8);
        d.load();
        System.out.println("Cargo Capacity: " + Cargo2.capacity());
        System.out.println("9====================");
        b.unload();
        System.out.println("Cargo Capacity: " + Cargo2.capacity());
        System.out.println("10====================");
        c.load();
        System.out.println("11====================");
        b.details();
        System.out.println("Cargo Capacity: " + Cargo2.capacity());
    }
}



/*

- .load() method marks an object as selected for transport
    - and .unload() method unmarked it.

- At a time, the transport capacity is 10.0 tonnes.

- Each Cargo object is initialized with 2 attributes from the constructor 
    - the contents and 
    - the weight.

Cargo Capacity: 10.0
1====================
Cargo ID: 1, Contents: Industrial Machinery, Weight: 4.5, Loaded: false
2====================
Cargo 1 loaded for transport.
3====================
Cargo ID: 2, Contents: Steel Ingot, Weight: 2.7, Loaded: false
4====================
Cargo Capacity: 5.5
5====================
Cargo 2 loaded for transport.
Cargo Capacity: 2.8
6====================
Cannot load cargo, exceeds weight capacity.
7====================
Cargo ID: 3, Contents: Tree Trunks, Weight: 3.6, Loaded: false
Cargo ID: 2, Contents: Steel Ingot, Weight: 2.7, Loaded: true
8====================
Cargo 4 loaded for transport.
Cargo Capacity: 1.0
9====================
Cargo 2 unloaded.
Cargo Capacity: 3.7
10====================
Cargo 3 loaded for transport.
11====================
Cargo ID: 2, Contents: Steel Ingot, Weight: 2.7, Loaded: false
Cargo Capacity: 0.09999999999999964

 */