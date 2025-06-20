package tp5_bibliotheque;
import java.time.LocalDate;

public class Reservation {
    private final Livre livre;
    private final String utilisateur;
    private final LocalDate dateReservation;
    
    public Reservation(Livre livre, String utilisateur) {
        this.livre = livre;
        this.utilisateur = utilisateur;
        this.dateReservation = LocalDate.now();
    }
    
    public Livre getLivre() {
        return livre;
    }
    
    public String getUtilisateur() {
        return utilisateur;
    }
    
    public LocalDate getDateReservation() {
        return dateReservation;
    }
}
