package tp3_jeu_de_cartes;

public class CarteSpecial extends Carte {
    private final String effet;
    public CarteSpecial(String nom, String effet) {
        super(nom, 0);
        this.effet = effet;
    }
    @Override
    public void jouer() {
        System.out.println("J'active l'effet : " + effet);
    }
    @Override
    public String toString(){
        return "cette carte est un " + nom + " qui a pour effet " + this.effet;
    }
    public boolean isEqualName(CarteSpecial c){
        return nom.equals(c.nom);
    }
 }
