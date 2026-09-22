public class q25_a2u2 {
    public static void main(String [] args){
        ChickenBurger b1 = new ChickenBurger();
        System.out.println(b1.bun)
        System.out.println(b1.price);
        System.out.println(b1.sauceOption);
        System.out.println(b1.spiceLevel);
        System.out.println("----------1----------");
        System.out.println(b1.serveBurger());
        System.out.println("----------2----------");
        b1.customizeSpiceLevel("Extreme Jhaal");
        b1.customizeSpiceLevel("Spicy");
        System.out.println("----------3----------");
        System.out.println(b1.serveBurger());
        System.out.println("----------4----------");
        ChickenBurger b2 = new ChickenBurger();
        b2.bun = "Brioche";
        b2.price += 50;
        b2.sauceOption = "Regular";
        b2.customizeSpiceLevel("Naga");
        System.out.println("----------5----------");
        System.out.println(b2.serveBurger());
    }
}





/*

Sesame
200
Less
Not Set
----------1----------
Cannot serve now. Customize Spice Level first.
----------2----------
This spice level is unavailable.
Spice level set to Spicy.
----------3----------
The burger is being served:-
Bun Type: Sesame
Price: 200
Sauce Option: Less
Spice Level: Spicy
----------4----------
Spice level set to Naga.
----------5----------
The burger is being served:-
Bun Type: Brioche
Price: 250
Sauce Option: Regular
Spice Level: Naga

 */