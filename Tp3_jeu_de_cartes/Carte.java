package Tp3_jeu_de_cartes;

public abstract class Carte {
    protected final String nom;
    protected final int valeur;
    public Carte(String nom, int valeur) {
        this.nom = nom;
        this.valeur = valeur;
    }
    public abstract void jouer();
 }