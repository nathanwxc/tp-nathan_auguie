package Tp2_math;

public class MathUtils {
   
     
    public static int calculerPGCD(int a, int b) {   

        while (b != 0) { 
            int reste = a % b;
            a = b;
            b = reste;
        }
        return a;
    }

    
}
