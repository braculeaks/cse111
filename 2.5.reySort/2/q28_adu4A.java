public class q28_adu4A {
    public static void main (String[] args) {
        Dog scooby = new Dog();
        Dog oldie = new Dog();
        Dog goofy = new Dog();
        scooby.changeName("Scooby");
        goofy.changeName("Goofy");
        System.out.println("1. ===============");
        System.out.println(scooby.bark());
        System.out.println("2. ===============");
        System.out.println(oldie.bark());
        System.out.println("3. ===============");
        oldie.changeColor("White");
        System.out.println("4. ===============");
        System.out.println(oldie.bark());
        System.out.println("5. ===============");
        System.out.println(goofy.bark());
        System.out.println("6. ===============");
        scooby.changeColor("Brown");
        System.out.println("7. ===============");
        System.out.println(scooby.bark());
        System.out.println("8. ===============");
        goofy.changeColor("Black");
    }
}


/*

You will need a lot of if else for this one. 
Instead of having default values, Just hardcode all the if else.

1. ===============
Scooby is barking
2. ===============
A dog is barking
3. ===============
This dog is White
4. ===============
White dog is barking
5. ===============
Goofy is barking
6. ===============
Scooby is Brown
7. ===============
Scooby the Brown dog is barking
8. ===============
Goofy is Black

 */