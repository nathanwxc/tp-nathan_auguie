

public class MathUtils {
    private final int x;
    private final int y;
    public MathUtils(int x,int y){
        this.x = x;
        this.y = y;
    }
     
    public int calculerPGCD() {   
        int a = x;
        int b = y;

        while (b != 0) { 
            int reste = a % b;
            a = b;
            b = reste;
        }
        return a;
    }

    public static void main(String[] args){
        MathUtils pgcd = new MathUtils(42,30);
        System.out.println("pgcd : " + pgcd.calculerPGCD());
    }
}
