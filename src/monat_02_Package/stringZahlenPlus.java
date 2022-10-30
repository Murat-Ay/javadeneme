package monat_02_Package;
public class stringZahlenPlus {
    //Kullanicinin String olarak verdigi iki fiyati
    //toplayabilen bir kod yaziniz*/
    public static void main(String[] args) {
        String fiyat1="12.564";
        String fiyat2="13.075";
        fiyat1=fiyat1.replaceAll("\\D","");//1256
        fiyat2=fiyat2.replaceAll("\\D","");//1307

        Double sayi1=Double.parseDouble(fiyat1);//1256.0
        Double sayi2=Double.parseDouble(fiyat2);//1307.0
        System.out.println((sayi1+sayi2)/1000);
    }
}
