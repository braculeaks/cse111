public class q61C_a6h4 {
    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber();
        cn1.details();
        System.out.println("----------------");
        ComplexNumber cn2 = new ComplexNumber(5.0, 7.0);
        cn2.details();
    }
}




class RealNumber {
    public double realValue;

    public RealNumber() {
        this(0.0);
    }

    public RealNumber(double realValue) {
        this.realValue = realValue;
    }


    public String getReal() {
        return "RealPart: " + realValue;
    }
}



/*

(Task for Student)

RealPart: 1.0
ImaginaryPart: 1.0
----------------
RealPart: 5.0
ImaginaryPart: 7.0

 */




class ComplexNumber extends RealNumber {
    double complex = 1.0;

    ComplexNumber(){
        super(1.0);
    }
    ComplexNumber(double r, double c){
        super(r);
        complex = c;
    }

    void details(){
        System.out.println(super.getReal());
        System.out.println("ImaginaryPart: "+complex);
    }

}