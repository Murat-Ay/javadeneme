package AY_01_Package;

import java.util.Scanner;

public class DataCastingX3 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen bir tamsayi giriniz");
            int girilenSayi= scan.nextInt();
            System.out.println("Girdiginiz sayinin kupu : " + (girilenSayi*girilenSayi*girilenSayi));
            scan.close();
        }
    }

