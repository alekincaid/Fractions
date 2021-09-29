
/**
 * Tests the fraction class 
 *
 * @author (Alejandro Kincaid and Bennett Proffitt)
 * @version (1.0)
 */
public class Test
{
        public static void main (String[] args)
    {
        Fraction oneThird = new Fraction(1,3);
        Fraction oneHalf = new Fraction (1,2);
        Fraction oneFourth = new Fraction(1,4);
        System.out.println(oneThird);
        System.out.println(oneHalf);
        System.out.println(oneFourth);
        System.out.println(oneThird.getDenominator());
        System.out.println(oneHalf.getNumerator());
        System.out.println(oneThird.add(oneFourth));
        System.out.println(oneHalf.substract(oneFourth));
        System.out.println(oneHalf.divide(oneFourth));
        System.out.println(oneHalf.multiply(oneFourth));
        
        
        
        
        
    }
    
        
        
        
}

        
    
   


    
