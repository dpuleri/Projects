public class Complex {
    private double real;
    private double imaginary;
    
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
    public double getReal(double real) {
        return this.real;
    }
    public double getImaginary(double imaginary) {
        return this.imaginary;
    }
    public String toString() {
        return this.real + " + " + this.imaginary + "i";
    }
    public Complex add(Complex in) {
        return new Complex(this.real + in.real, this.imaginary + imaginary);
    }
    public Complex subtract(Complex in) {
        return new Complex(this.real - in.real, this.imaginary - imaginary);
    }
    public Complex multiply(Complex in) {
        double newReal = (this.real * in.real) - (this.imaginary * in.imaginary);
        double newImaginary = (this.real * in.imaginary) + 
            (this.imaginary * in.real);
        return new Complex(newReal, newImaginary);
    }
    public Complex multiply(double in) {
        return new Complex(this.real * in, this.imaginary * in);
    }
    public Complex divide(Complex in) {
        double newReal = (this.real * in.real + this.imaginary + in.imaginary)
            / ((in.real * in.real) + (in.imaginary * in.imaginary));
        double newImaginary = (this.imaginary * in.real  
            - this.real * in.imaginary) / ((in.real * in.real) 
                + (in.imaginary * in.imaginary));
        return new Complex(newReal, newImaginary);
    }
    public Complex divide(double in) {
        return new Complex(this.real / in, this.imaginary / in);
    }
    public Complex invert() {
        Complex numerator = new Complex(real, -imaginary); //also conjugate
        double denominator = ((this.real * this.real) + (this.imaginary
            * this.imaginary));
        numerator.setReal(numerator.real / denominator);
        numerator.setImaginary(numerator.imaginary / denominator);
        return numerator;
    }
    public static void main(String[] args) {
        Complex one = new Complex(1, 2);
        Complex two = new Complex(2, 2);
        Complex three = one.add(two);
        Complex four = one.multiply(two);
        Complex five = one.divide(two);
        Complex six = one.invert();
        Complex seven = one.multiply(5);
        Complex eight = one.divide(2);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
        System.out.println(eight);
    }
}