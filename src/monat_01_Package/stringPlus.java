package monat_01_Package;
public class stringPlus {
    public static void main(String[] args) {
        /* Kullanicinin String olarak verdigi iki fiyati
          toplayabilen bir kod yaziniz */

        String fiyat1= "$20.25";
        String fiyat2= "$34.40";
        fiyat1=fiyat1.replaceAll("\\D","");
        fiyat2=fiyat2.replaceAll("\\D","");

        Double sayi1= Double.parseDouble(fiyat1);
        Double sayi2= Double.parseDouble(fiyat2);
        System.out.println("sayi1 : " + sayi1/100);
        System.out.println("sayi2 : " + sayi2/100);
        System.out.println("sayi1+sayi2 : $" + (sayi1+sayi2)/100);
        /* parseInteger veya parseDouble
        String olarak girilen ancak TAMEMEN SAYILARDAN olusan bir ifadeyi
        int veya double'a cevirir */
    }
}
