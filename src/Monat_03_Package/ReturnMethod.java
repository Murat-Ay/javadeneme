package Monat_03_Package;

public class ReturnMethod {
    public static void main(String[] args) {
        String isim ="alivelI";
        String soyisim ="ayDINLI";

        String isimSoyisim=isimDuzenleme(isim,soyisim);
        System.out.println("ilk girilen:" +isim +" " +soyisim);
        System.out.println("Degistirilmis hali:" + isimSoyisim);
    }
    private static String isimDuzenleme(String isim, String soyisim) {
        String isimDuzenlenmis=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        String soyisimDuzenlenmis=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();

        return isimDuzenlenmis + " " +soyisimDuzenlenmis;

    }
}
