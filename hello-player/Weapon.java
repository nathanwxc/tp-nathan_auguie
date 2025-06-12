import java.util.Random;

public class Weapon {
    private int minDamage;
    private int maxDamage;
    private Random random; 

    public Weapon(int minDamage, int maxDamage) {
        if (minDamage > maxDamage) {
            throw new IllegalArgumentException("minDamage doit être inférieur ou égal à maxDamage");
        }
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.random = new Random();
    }

    public int rollDamage() {
        return random.nextInt(maxDamage - minDamage + 1) + minDamage;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    // Exemple d'utilisation
    public static void main(String[] args) {
        Weapon sword = new Weapon(10, 20);
        System.out.println("Dégâts infligés : " + sword.rollDamage());
    }
}
