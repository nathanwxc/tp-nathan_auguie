import Tp2_math.MathUtils;
import Tp2_math.Fraction;
import Tp3_jeu_de_cartes.*;

public class App {
    public static void main(String[] args){
        //Tp2
        int pgcd = MathUtils.calculerPGCD(42,30);
        System.out.println("pgcd : " + pgcd);
        assert MathUtils.calculerPGCD(42,30) == pgcd;

        Fraction f = new Fraction(2, 3);
        Fraction g = new Fraction(1, 6);
        System.out.println(f.add(g).toString());
        assert f.add(g).toString().equals("5/6");
        assert f.multiply(g).toString().equals("1/9");

        //Tp3
        Carte[] main = new Carte[3];
        main[0] = new CarteChiffre("Cœur", 7);
        main[1] = new CarteSpecial("Joker", "Change la couleur");
        main[2] = new CarteChiffre("Pique", 1);
        for (Carte c : main) {
            c.jouer();
        }
    }
}
