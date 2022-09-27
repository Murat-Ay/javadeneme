package AY_04_Package;

import static AY_04_Package.Varargs.topla;

public class VarArgstToplama {
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
