package Monat_02_Package;

public class breakFor {
    public static void main(String[] args) {

        int veritabaniKayitSayisi = 33;
        for(int i=1; i<veritabaniKayitSayisi; i++) {
            System.out.println(i + ". kayit");
            if(i == 15) {
                break;
            }
        }
    }
}
