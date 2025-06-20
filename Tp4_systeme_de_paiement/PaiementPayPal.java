package tp4_systeme_de_paiement;

 public class PaiementPaypal implements Paiement {
    private String email;
    private double solde;
    public PaiementPaypal(String email, double solde) {
        this.email = email;
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
        return "PayPal";
    }
 }
