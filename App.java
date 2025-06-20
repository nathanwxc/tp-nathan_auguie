import tp2_math.Fraction;
import tp2_math.MathUtils;
import tp3_jeu_de_cartes.*;
import tp4_systeme_de_paiement.*;
import tp5_bibliotheque.Bibliotheque;
import tp5_bibliotheque.Emprunt;
import tp5_bibliotheque.Livre;

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
        /*PaiementCarte paiement1 = new PaiementCarte("2354", 325);
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
        }  */
        
        Bibliotheque bibliotheque = new Bibliotheque();

        Livre livre1 = new Livre("978-3-16-148410-0", "Le Petit Prince", "Antoine de Saint-Exupéry");
        Livre livre2 = new Livre("978-2-07-036042-4", "L'Étranger", "Albert Camus");
        bibliotheque.ajouterLivre(livre1);
        bibliotheque.ajouterLivre(livre2);
        System.out.println("Livres ajoutés à la bibliothèque.");


        bibliotheque.reserverLivre(livre1.getIsbn(), "Jean");


        if (livre1.isDisponible()) {
            Emprunt emprunt1 = new Emprunt(livre1, 7);  
            System.out.println("\nEmprunt réalisé :");
            System.out.println("Livre emprunté: " + emprunt1.getLivre().getTitre() + " par Marie");
            System.out.println("Date de retour prévue : " + emprunt1.getDateRetour());

            emprunt1.retourner();
            System.out.println("Livre retourné par Marie.");

            bibliotheque.retournerLivre(livre1.getIsbn());
        } else {
            System.out.println("Le livre \"" + livre1.getTitre() + "\" n'est pas disponible pour emprunt.");
        }
        
        Emprunt emprunt2 = new Emprunt(livre2, 3);  
        System.out.println("\nEmprunt réalisé:");
        System.out.println("Livre emprunté: " + emprunt2.getLivre().getTitre());
        System.out.println("Date de retour prévue : " + emprunt2.getDateRetour());


        double penalite = emprunt2.calculerPenalite();
        System.out.println("Pénalité calculée pour cet emprunt: " + penalite + " €");

    

        System.out.println("\nTests terminés.");
    }
}
    

