
/**
 * This code should bring back a fraction and allow people to add and subtract them.
 *
 * @author (Alejandro Kincaid and Bennett Proffitt)
 * @version (1.0)
 */
public class Fraction
{
    // instance variables - replace the example below with your own
    private int numerator;
    private int denominator;

    /**
     * Constructor for objects of class Fraction
     */
    public static void main (String[] args)
    {
        Fraction oneThird = new Fraction(1,3);
        Fraction oneHalf = new Fraction (1,2);
        Fraction oneFourth = new Fraction(1,4);
    }
    public Fraction(int numer, int denom)
    {
        // initialise instance variables
        numerator = numer;
        denominator = denom;
    }
    public Fraction()
    {
        numerator = 0;
        denominator = 1;
    }
    public int getDenominator() 
    { 
      return denominator;
    }
    public int getNumerator()
    {
        return numerator;
    }
    public Fraction add(Fraction f)
    {
        int numer = numerator * f.denominator + f.numerator * denominator;
        int denom = denominator * f.denominator;
        return new Fraction(numer,denom);
    }
    public Fraction substract(Fraction f)
    {
        int numer = numerator * f.denominator - f.numerator * denominator;
        int denom = denominator * f.denominator;
        return new Fraction(numer,denom);
    }
    public Fraction multiply(Fraction f)
    {
        int numer = numerator * f.numerator;
        int denom = denominator * f.denominator;
        return new Fraction(numer,denom);
    }
    public Fraction divide(Fraction f) 
    {
        int numer = numerator * f.denominator; 
        int denom = denominator * f.numerator; 
        return new Fraction(numer,denom);
        
    }
    public String toString()
    {
        
            return(String) String.valueOf(numerator) + "/" + String.valueOf(denominator);
        
    }

}
