public class q67_kni37 {
    public static void main(String[] args) {
        RealNumber rn1 = new RealNumber(2.69);
        System.out.println(rn1);
        System.out.println("----------------");
        ComplexNumber cn1 = new ComplexNumber();
        System.out.println(cn1);
        System.out.println("----------------");
        ComplexNumber cn2 = new ComplexNumber(5.0, 7.0);
        System.out.println(cn2);
    }
}

class RealNumber extends Object {
    public double realValue;

    public RealNumber() {
        this(0.0);
    }

    public RealNumber(double realValue) {
        this.realValue = realValue;
    }

    @Override
    public String toString() {
        return "RealPart: " + realValue;
    }
}

class ComplexNumber extends RealNumber{
    double comValue;

    ComplexNumber(double realValue, double comValue){
        super(realValue);
        this.comValue = comValue;
    }

    ComplexNumber(){
        this(1.0, 1.0);
    }

    @Override
    public String toString() {
        return super.toString() + "\nImaginaryPart: " + comValue;
    }
}



/*

Introducing: @override toString()
Introducing: Object class

    class RealNumber {}                 is the same as
    class RealNumber extends Object {}

RealPart: 2.69
----------------
RealPart: 1.0
ImaginaryPart: 1.0
----------------
RealPart: 5.0
ImaginaryPart: 7.0

 */