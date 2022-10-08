package Monat_09_interview;

public class tersYazdirma {

        public static void main(String[] args) {
            int sayi = 9875, tersi = 0;
            int yedek=sayi;

            for(;sayi != 0; sayi /= 10) {
                int basamak = sayi % 10;
                tersi = tersi * 10 + basamak;
            }
            System.out.println("Sayi: " + yedek);
            System.out.println("Sayının Tersi: " + tersi);
        }
    }

