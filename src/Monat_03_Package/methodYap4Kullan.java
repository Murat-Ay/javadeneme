package Monat_03_Package;
public class methodYap4Kullan {
    public static void toplama(int sayi1, int sayi2) {
        int sonuc = sayi1 + sayi2;
        System.out.println(sayi1 + " + " + sayi2 + " = " + sonuc);
}
    public static void cikarma(int sayi1, int sayi2) {
        int sonuc = sayi1 - sayi2;
        System.out.println(sayi1 + " - " + sayi2 + " = " + sonuc);
    }
    public static void carpma(int sayi1, int sayi2) {
        int sonuc = sayi1 * sayi2;
        System.out.println(sayi1 + " x " + sayi2 + " = " + sonuc);
    }
    public static void bolme(int sayi1, int sayi2) {
        int sonuc = sayi1 / sayi2;
        System.out.println(sayi1 + " / " + sayi2 + " = " + sonuc);
    }
    public static void main(String[] args) {
        methodYap4Kullan.bolme(24,2);


    }
}