public class ComplexNumber extends RealNumber {     /* a6q4 */
    public double iV;
    ComplexNumber() {
        super(1.0);
        this.iV = 1.0;
    }
    ComplexNumber(double r, double i) {
        super(r);
        this.iV = i;
    }
    String details() {
        return super.getReal() + "\n"
            + "ImaginaryPart: " + iV;
    }
}
