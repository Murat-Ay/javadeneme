package Monat_02_Package;

import java.util.Scanner;

public class bolunebilme5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //kullanicidan 2 sayi alip bunlardan 5 ile bölünebilenleri yazdirin
        System.out.println("lutfen iki sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        if (sayi1%5==0){
            System.out.println(sayi1 + " sayisi 5 ile bölünebilir");}
        else System.out.println(sayi1 + " sayisi 5 ile bölünemez");
        if (sayi2%5==0){
            System.out.println(sayi2 + " sayisi 5 ile bölünebilir");}
        else System.out.println(sayi2 + " sayisi 5 ile bölünemez");
    }
}
