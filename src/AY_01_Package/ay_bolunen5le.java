package AY_01_Package;

import java.util.Scanner;

public class ay_bolunen5le {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int girilenSayi=scan.nextInt();
        if (girilenSayi %5==0) {
            System.out.println("sayi 5 in tam kati");
        } else System.out.println("sayi 5 in kati degil");
    }
}
