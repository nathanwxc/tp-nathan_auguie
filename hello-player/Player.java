// Player.java
 public class Player {
    private final String name;
    private int hp;
    public Player(String name) {
        this.name = name;
        this.hp = 100;
    }
    public void greet() {
        System.out.println("Bonjour, je suis " 
+ name + " !");
    }

    public void takeDamage(int amount){
        this.hp -= amount;
        System.out.println("J'ai pris " 
+ amount + " dégâts et il me reste " + hp + " de vie");
    }

    public boolean  isAlive(){
        return this.hp > 0;
    }
    public static void main(String[] args) {
        Player p = new Player("Bruno");
        p.greet();
        p.takeDamage(15);
        Player bob = new Player("Bob");
        bob.takeDamage(85);
        assert !bob.isAlive();
        bob.takeDamage(15);
        assert !bob.isAlive() : "Bob aurait dû être KO"; 
    }
 }


