public class q22_a2h1 {
    public static void main(String [] args){
        ImaginaryNumber num1 = new ImaginaryNumber();
        String p = num1.printNumber();
        System.out.println(p);
        System.out.println("1********");
        num1.realPart=3;
        num1.imaginaryPart=7;
        System.out.println(num1.printNumber());
        System.out.println("2********");
        ImaginaryNumber num2 = new ImaginaryNumber();
        num2.realPart=1;
        num2.imaginaryPart=9;
        System.out.println(num2.printNumber());
    }
}


class ImaginaryNumber {
    public int realPart;
    public int imaginaryPart;

    // Member Function/Method
    String printNumber() {
        return this.realPart + " + " + this.imaginaryPart + "i" + " SMTH: " + SMTH ;
    }
}


/*

0 + 0i
1********
3 + 7i
2********
1 + 9i

*/