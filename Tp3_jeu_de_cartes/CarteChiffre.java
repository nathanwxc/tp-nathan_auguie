package Tp3_jeu_de_cartes;

 public class CarteChiffre extends Carte {
    private final String couleur;
    public CarteChiffre(String couleur, int valeur) {
        super(valeur + " de " + couleur, valeur);
        this.couleur = couleur;
    }
    @Override
    public void jouer() {
        System.out.println("Je joue le " + nom);
    }
 }
