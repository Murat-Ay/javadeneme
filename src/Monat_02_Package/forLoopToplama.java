package Monat_02_Package;

import java.util.Scanner;

public class forLoopToplama {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int a= scan.nextInt();
        int toplam=0;
        for (int i = 1; i <a ; i++) {
            toplam+=i;}
            System.out.println("sayilarin toplami: " +toplam);
        }
    }

