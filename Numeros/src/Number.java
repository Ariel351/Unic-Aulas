 public class Number {
    protected double real;
    protected double imaginari;
    protected int numerator;
    protected int denominator;
    
    public Number(double real, double imaginari) {
        this.real = real;
        this.imaginari = imaginari;
    }
    public Number( int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    public double getReal() {
        return real;
    }
    
    public void setReal(double real) {
        this.real = real;
    }
    
    public double getImaginari() {
        return imaginari;
    }
    
    public void setImaginari(double imaginari) {
        this.imaginari = imaginari;
    }
    public int getNumerator() {
        return numerator;
    }
    
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        reduce();
    }
    
    public int getDenominator() {
        return denominator;
    }
    
    public void setDenominator(int denominator) {
        this.denominator = denominator;
        reduce();
    }
    
    private void reduce() {
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        int mdc = findMdc(numerator, denominator);
        numerator /= mdc;
        denominator /= mdc;
    }
    
    private int findMdc(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return Math.abs(x);
    }
}





