package Monat_02_Package;
import java.util.Scanner;
public class forLoopZahlPlus {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir tamsayi alip rakamlari toplamini
        //yazdirabilen bir kod yaziniz, forLoop ile
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt();
        int ilkGirilenSayi=sayi;
        String sayiStr=sayi+"";
        int basSayisi=sayiStr.length();
        int rakamlarToplama=0;
        int birlerBasamagi=0;
        for (int i = 1; i <=basSayisi ; i++) {
           birlerBasamagi=sayi%10;
           rakamlarToplama=birlerBasamagi+rakamlarToplama;
           sayi=sayi/10;
        }
        System.out.println(ilkGirilenSayi + " rakamlar toplami: " + rakamlarToplama);
    }
}
