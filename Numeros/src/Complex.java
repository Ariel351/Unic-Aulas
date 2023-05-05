public class Complex extends Number {
    public Complex(double real, double imaginari) {
        super(real, imaginari);
    }
    
    public Complex add(Complex other) {
        double real = this.real + other.getReal();
        double imag = this.imaginari + other.getImaginari();
        return new Complex(real, imag);
    }
    
    public Complex subtract(Complex other) {
        double real = this.real - other.getReal();
        double imag = this.imaginari - other.getImaginari();
        return new Complex(real, imag);
    }
    
    public String toString() {
        return "(" + real + ", " + imaginari + ")";
    }
}