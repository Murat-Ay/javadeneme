package monat_11_interview;

public class forLoop {
    public static void main(String[] args) {
        //Verilen iki sayinin ilkinden baslayip ikincisine
        //kadar 5'er 5'er yazdirin.

        int bas=20;
        int bitis=97;

        for ( int i = bas; i <=bitis ; i+=5) {

            System.out.print(i + " ");

        }
        System.out.println("");

        //Verilen sayidan baslayarak geriye 1'e kadar
        //7 ile bölunebilen sayilari yazdirin.

        int input= 300;
        for (int i = 300; i>1 ; i-- ) {
            if (i%7==0){
                System.out.print(i + " ");
            }
        }
    }
}
