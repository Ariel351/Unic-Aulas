public class Rational extends Number {

    public Rational(int numerator, int denominator) {
        super( numerator, denominator);
    }

    public Rational add(Rational other) {
        int num = numerator * other.getDenominator() + denominator * other.getNumerator();
        int den = denominator * other.getDenominator();
        return new Rational(num, den);
    }
    
    public Rational subtract(Rational other) {
        int num = numerator * other.getDenominator() - denominator * other.getNumerator();
        int den = denominator * other.getDenominator();
        return new Rational(num, den);
    }
    
    public Rational multiply(Rational other) {
        int num = numerator * other.getNumerator();
        int den = denominator * other.getDenominator();
        return new Rational(num, den);
    }
    
    public Rational divide(Rational other) {
        int num = numerator * other.getDenominator();
        int den = denominator * other.getNumerator();
        return new Rational(num, den);
    }
    
    public String toString() {
        return numerator + "/" + denominator;
    }
    
    public double toFloat(int precision) {
        return ((double) numerator) / denominator;
    }
}