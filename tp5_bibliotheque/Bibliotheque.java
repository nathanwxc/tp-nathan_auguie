package tp5_bibliotheque;

import java.util.*;

public class Bibliotheque {
    private final Map<String, Livre> livres;
    private final Map<String, List<Livre>> livresParAuteur;
    private final Map<String, Queue<Reservation>> reservations;
    
    public Bibliotheque() {
        this.livres = new HashMap<>();
        this.livresParAuteur = new HashMap<>();
        this.reservations = new HashMap<>();
    }
    
    public void ajouterLivre(Livre livre) {
        livres.put(livre.getIsbn(), livre);
        livresParAuteur
            .computeIfAbsent(livre.getAuteur(), k -> new ArrayList<>())
            .add(livre);
    }
    
    public Livre rechercherParIsbn(String isbn) {
        return livres.get(isbn);
    }
    
    public List<Livre> rechercherParAuteur(String auteur) {
        return livresParAuteur.getOrDefault(auteur, new ArrayList<>());
    }
    
    public boolean reserverLivre(String isbn, String utilisateur) {
        Livre livre = livres.get(isbn);
        if (livre == null) {
            System.out.println("Le livre avec ISBN " + isbn + " n'existe pas.");
            return false;
        }
        
        Queue<Reservation> file = reservations.computeIfAbsent(isbn, k -> new LinkedList<>());
        Reservation res = new Reservation(livre, utilisateur);
        file.add(res);
        System.out.println("Réservation effectuée pour " + utilisateur + " sur le livre \"" + livre.getTitre() + "\".");
        return true;
    }
    

    public void retournerLivre(String isbn) {
        Livre livre = livres.get(isbn);
        if (livre == null) {
            System.out.println("Le livre avec ISBN " + isbn + " n'existe pas.");
            return;
        }
        livre.setDisponible(true);
        System.out.println("Le livre \"" + livre.getTitre() + "\" a été retourné.");
        
        Queue<Reservation> file = reservations.get(isbn);
        if (file != null && !file.isEmpty()) {
            Reservation prochaineReservation = file.poll();
            System.out.println("Le livre est désormais réservé pour " + prochaineReservation.getUtilisateur() + ".");
            livre.setDisponible(false);
        }
    }
}
