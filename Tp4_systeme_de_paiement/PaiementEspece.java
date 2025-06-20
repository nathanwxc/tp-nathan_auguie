package tp4_systeme_de_paiement;

 public class PaiementEspece implements Paiement {
    private String numRecu;
    private double solde;
    public PaiementEspece(String numRecu, double solde) {
        this.numRecu = numRecu;
        this.solde = solde;
    }
    @Override
    public boolean payer(double montant) {
        if (montant <= solde) {
            solde -= montant;
            return true;
        }
        return false;
    }
    @Override
    public double getSolde() {
        return solde;
    }
    @Override
    public String getType() {
        return "Espèce";
    }
 }
