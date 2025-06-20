package tp4_systeme_de_paiement;

import java.util.ArrayList;
import java.util.List;

 public class GestionnairePaiement {
    private final List<Paiement> methodes;
    public GestionnairePaiement() {
        this.methodes = new ArrayList<>();
    }
    public void ajouterMethode(Paiement methode) {
        methodes.add(methode);
    }

    
    public boolean effectuerPaiement(double montant) {
        methodes.sort((p1,p2)->Double.compare(p2.getSolde(), p1.getSolde()));
        for (Paiement p : methodes) {
            if (p.payer(montant)) {
                System.out.println("Paiement effectué via " + p.getType());
                return true;
            }
            else {
                System.out.println("Paiement refusé via " + p.getType());
            }
        }
        return false;
    }
 }
