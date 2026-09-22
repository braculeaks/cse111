public class q28_adu4B {
    public static void main (String[] args) {
        Dog2 scooby = new Dog2();
        Dog2 oldie = new Dog2();
        Dog2 goofy = new Dog2();
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