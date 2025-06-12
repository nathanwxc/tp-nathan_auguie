package Tp2_math;

public class Fraction {
    private final int num;  // numérateur
    private final int den;  // dénominateur (>0)
    public Fraction(int num, int den) {
        int pgcd = MathUtils.calculerPGCD(num, den);
        if (pgcd==1) {
            this.num = num;
            this.den = den;
        } 
        else {
            this.num = num%pgcd;
            this.den = den%pgcd;
        }// TODO: simplifier la fraction avec pgcd
        if (den==0){
            throw new IllegalArgumentException("impossible to divide by 0");
        }// TODO: gérer den == 0 (IllegalArgumentException)
    }

    
}
