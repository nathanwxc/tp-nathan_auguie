package Tp4_systeme_de_paiement;

public interface Paiement {
    boolean payer(double montant);
    double getSolde();
    String getType();
}
