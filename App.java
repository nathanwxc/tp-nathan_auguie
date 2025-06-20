import tp2_math.Fraction;
import tp2_math.MathUtils;
import tp3_jeu_de_cartes.*;
import tp4_systeme_de_paiement.*;

public class App {
    public static void main(String[] args){
        //Tp2
        /*int pgcd = MathUtils.calculerPGCD(42,30);
        System.out.println("pgcd : " + pgcd);
        assert MathUtils.calculerPGCD(42,30) == pgcd;

        Fraction f = new Fraction(2, 3);
        Fraction g = new Fraction(1, 6);
        System.out.println(f.add(g).toString());
        assert f.add(g).toString().equals("5/6");
        assert f.multiply(g).toString().equals("1/9");*/

        //Tp3
        /*Carte[] main = new Carte[4];
        main[0] = new CarteChiffre("Cœur", 7);
        main[1] = new CarteSpecial("Joker", "Change la couleur");
        main[2] = new CarteChiffre("Pique", 1);
        main[3] = new CarteChiffre("Cœur", 7);
        for (Carte c : main) {
            c.jouer();
            System.out.println(c.toString());
        }
        CarteChiffre test1 = new CarteChiffre("pique", 5);
        CarteChiffre test2 = new CarteChiffre("pique", 5);
        System.out.println(test1.isEqualValue(test2));
        System.out.println(test1.isTotallyEquals(test2));*/

        //Tp4 
        PaiementCarte paiement1 = new PaiementCarte("2354", 325);
        PaiementPaypal paiement2 = new PaiementPaypal("paypal@paypal.fr", 1088);
        PaiementEspece paiement3 = new PaiementEspece("345", 300);
        GestionnairePaiement portefeuille = new GestionnairePaiement();
        portefeuille.ajouterMethode(paiement1);
        portefeuille.ajouterMethode(paiement2);
        portefeuille.ajouterMethode(paiement3);
        if (portefeuille.effectuerPaiement(100)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }  
        
    }
}
