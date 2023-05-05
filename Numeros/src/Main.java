public class Main {
    
public static void main(String[] args) {
    // Rational
    Rational num1 = new Rational(2, 4);
    Rational num2 = new Rational(3, 6);
    
    System.out.println(num1);
    System.out.println(num2.toFloat(2));
    Rational sumRational = num1.add(num2);
    System.out.println(sumRational);
    Rational subRational = num1.subtract(num2);
    System.out.println(subRational.toFloat(2));
    Rational mulRational = num1.multiply(num2);
    System.out.println(mulRational);
    Rational divRational = num1.divide(num2);
    System.out.println(divRational.toFloat(2));
    
    // Complex
    Complex num3 = new Complex(2.0, 4.0);
    Complex num4 = new Complex(3.0, 6.0);
    
    System.out.println(num3);
    Complex sumComplex = num3.add(num4);
    System.out.println(sumComplex);
    Complex subComplex = num3.subtract(num4);
    System.out.println(subComplex);
}
}
