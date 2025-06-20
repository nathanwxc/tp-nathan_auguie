package Tp3_jeu_de_cartes;

public abstract class Carte {
    protected final String nom;
    protected final int valeur;
    public Carte(String nom, int valeur) {
        this.nom = nom;
        this.valeur = valeur;
    }
    public abstract void jouer();

    @Override
    public abstract String toString();

    public boolean isEquals(Carte c){
        return this.nom.equals(c.nom);
    }

    
 }