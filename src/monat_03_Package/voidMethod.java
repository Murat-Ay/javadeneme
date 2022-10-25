package monat_03_Package;

public class voidMethod {
    public static void main(String[] args) {

        boolean uyeMi = true;
        int uyelikYili = 1;
        double satisFiyati = 200;
        indirimliFiyatHesapla(uyeMi, uyelikYili, satisFiyati); }
        public static void indirimliFiyatHesapla(boolean uyeMi, int uyelikYili, double satisFiyati){
            if (uyeMi) {
                if (uyelikYili<5) {
                    System.out.println("urun fiyati:" + satisFiyati);
                    System.out.println("indirim miktari:" + satisFiyati*0.1);
                    System.out.println("indirimli fiyat:" + (satisFiyati-satisFiyati*0.1));
                } else {
                    System.out.println("urun fiyati:" + satisFiyati);
                    System.out.println("indirim miktari:" + satisFiyati*0.15);
                    System.out.println("indirimli fiyat:" + (satisFiyati-satisFiyati*0.15));
                }}
            else {
                    System.out.println("urun fiyati:" + satisFiyati);
                    System.out.println("indirim miktari:" + satisFiyati*0.05);
                    System.out.println("indirimli fiyat:" + (satisFiyati-satisFiyati*0.05));
            }}}
