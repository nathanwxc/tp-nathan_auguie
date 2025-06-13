import Tp2_math.MathUtils;
import Tp2_math.Fraction;

public class App {
    public static void main(String[] args){
        int pgcd = MathUtils.calculerPGCD(42,30);
        System.out.println("pgcd : " + pgcd);
        assert MathUtils.calculerPGCD(42,30) == pgcd;

        Fraction f = new Fraction(2, 3);
        Fraction g = new Fraction(1, 6);
        System.out.println(f.add(g).toString());
        assert f.add(g).toString().equals("5/6");
        assert f.multiply(g).toString().equals("1/9");
    }
}
