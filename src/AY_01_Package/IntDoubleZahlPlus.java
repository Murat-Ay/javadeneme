package AY_01_Package;

import java.util.Scanner;

public class IntDoubleZahlPlus {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int tamsayi=scan.nextInt();
        System.out.println("Lutfen ondalikli bir sayi giriniz");
        double ondalikliSayi= scan.nextDouble();
        System.out.println("girilen sayilarin carpimi : " + tamsayi*ondalikliSayi);
        System.out.println("girilen sayilarin toplami : " + (tamsayi+ondalikliSayi));
    }
}



