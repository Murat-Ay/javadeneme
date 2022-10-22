package monate_01_Package;

import java.util.Scanner;
public class stringManipulation {
    public static void main(String[] args) {
 Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi giriniz");
        String adSoyad= scan.nextLine();
        String ad=adSoyad.substring(0,adSoyad.indexOf(" "));
        String soyad=adSoyad.substring(adSoyad.indexOf(" ")+1);
        System.out.println("Ad :" + ad + "\nSoyad: " + soyad);
    }
}
