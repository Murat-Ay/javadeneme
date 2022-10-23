package monat_02_Package;

import java.util.Scanner;

public class ballSpringt {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.println("topun birakildigi ilk yuksekligi giriniz");
        double yukseklik = scan.nextDouble();
        double toplamYol = 0;
        int yereVurmaSayisi=0;
        do {
            yereVurmaSayisi++;
            toplamYol+=yukseklik;
            yukseklik*=0.75;
            toplamYol+=yukseklik;

        } while (yukseklik>1);
        System.out.println("topun yere vurma sayisi :" + yereVurmaSayisi);
        System.out.println("topun aldigi toplam yol :" + toplamYol);
    }
}
