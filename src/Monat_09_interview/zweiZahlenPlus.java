package Monat_09_interview;

import java.util.Scanner;

public class zweiZahlenPlus {
    public static void main(String[] args) {
/* Kullanıcıdan iki sayı alın. bu sayılardan küçük olandan büyük olan sayıya kadar olan tüm sayıların
 toplamını bulan bir kod yazınız. (her iki sayı da toplama dahil olmalı)  */
        Scanner scan= new Scanner(System.in);
        System.out.print("lütfen bir tamsayı giriniz : ");
        int a=scan.nextInt();
        System.out.print("lütfen farklı bir tamsayı giriniz : ");
        int b=scan.nextInt();
        int toplam = 0;
        if (a==b) {
            System.out.println("Girdiğiniz sayılar eşittir. Lütfen tekrar deneyin");
        } else if (a<b){
            toplam = (b*(b+1)- a*(a-1))/2;
            System.out.println("Girdiğiniz sayılar ve bu iki sayı arasında kalan tüm sayıların toplamı = " + toplam);
        } else if (b<a){
            toplam = (a*(a+1)- b*(b-1))/2;
            System.out.println("Girdiğiniz sayılar ve bu iki sayı arasında kalan tüm sayıların toplamı = " + toplam);
        }
    }
}


