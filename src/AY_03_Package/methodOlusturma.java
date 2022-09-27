package AY_03_Package;

public class methodOlusturma {
    public static void main(String[] args) {
       /* verilen 3 integer'i toplayip
        sonucu bize donduren bir method olusturun. */
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sonuc= dreiSayiTopla(sayi1,sayi2,sayi3);
        System.out.println("sayilar toplami:"+ dreiSayiTopla(4,6,7)); //17
        System.out.println("sayilar toplami:"+ dreiSayiTopla(56,-65,11)); //2
    }
    public static int dreiSayiTopla(int sayi1, int sayi2, int sayi3){
        return sayi1+sayi2+sayi3;
    }
}

