package tp2_math;

public class Fraction {
    private int num;  // numérateur
    private int den;  // dénominateur (>0)
    public Fraction(int num, int den) {

         if (den < 0){
            den = -den;
            num = -num;
        }
        
        this.num = num;
        this.den = den;

        int pgcd = MathUtils.calculerPGCD(this.num, this.den);
        if (pgcd!=1) {
            this.num = this.num / pgcd;
            this.den = this.den / pgcd;
        }
       
        // TODO: simplifier la fraction avec pgcd
        if (den==0){
            throw new IllegalArgumentException("impossible to divide by 0");
        }// TODO: gérer den == 0 (IllegalArgumentException)
       
    }
    public Fraction add(Fraction f){
        return new Fraction(this.num * f.den + f.num * this.den, this.den * f.den);
    }
    public Fraction multiply(Fraction f){
        return new Fraction(this.num * f.num, this.den * f.den);
    }

    public double toDouble(){
        return this.num / this.den;
    }

    public String compare(Fraction f){
        Fraction g = new Fraction(this.num, this.den);
        if (g.toDouble() > f.toDouble()){
            return "the fraction " + g.toString() + " is superior to " + f.toString();
        }
        if (g.toDouble() < f.toDouble()){
            return "the fraction " + g.toString() + " is inferior to " + f.toString();
        }
        else{
            return "the fraction " + g.toString() + " is equal to " + f.toString();
        }
    }
    
    @Override
    public String toString() {
        return  this.num + "/" + this.den ;
    }
   
}
