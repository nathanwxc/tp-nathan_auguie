package tp5_bibliotheque;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Emprunt {
    private final Livre livre;
    private final LocalDate dateEmprunt;
    private final LocalDate dateRetour;
    private boolean rendu;
    private final static double PENALITE_PAR_JOUR = 0.50; 
    
    public Emprunt(Livre livre, int dureeJours) {
        this.livre = livre;
        this.dateEmprunt = LocalDate.now();
        this.dateRetour = dateEmprunt.plusDays(dureeJours);
        this.rendu = false;
        livre.setDisponible(false);
    }
    
    public Livre getLivre() {
        return livre;
    }
    
    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }
    
    public LocalDate getDateRetour() {
        return dateRetour;
    }
    
    public boolean isRendu() {
        return rendu;
    }
    
    public void retourner() {
        this.rendu = true;
        livre.setDisponible(true);
    }
    
    public double calculerPenalite() {
        LocalDate aujourdHui = LocalDate.now();
        if (aujourdHui.isAfter(dateRetour)) {
            long joursRetard = ChronoUnit.DAYS.between(dateRetour, aujourdHui);
            return joursRetard * PENALITE_PAR_JOUR;
        }
        return 0.0;
    }
}
