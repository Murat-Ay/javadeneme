package Monat_04_Package;

public class VarArgst4 {
    public static void main(String[] args) {

    /* verilen sayilardan ilki haric digerlerini toplayip
    bulunan toplam degerini ilk sayi ile carpip yazdiran bir method olusturun
    input 3,4,5,6  output 3 * (4+5+6) = 45       */

        islemYap(3,4,5,6);
    }
    public static void islemYap(int a, int...b) {
        int toplam=0;
        for (int each:b
        ) {
            toplam+=each;
        }
        System.out.println("istenen islemin sonucu : " + a*toplam);
    }
}
