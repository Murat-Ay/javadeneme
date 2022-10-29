package Monat_04_Package;

import static Monat_04_Package.VarArgs.topla;

public class VarArgstPlus {
    public static void main(String[] args) {
        topla(2,3,4,5,16,7);
        carpma(2,3,4,5,-6);
        
    }
    public static void carpma(int... i) {
        int carpim=1;
        for (int each:i
             ) {
            carpim*=each;
        }
        System.out.println( "carpim = " + carpim );
    }
}
