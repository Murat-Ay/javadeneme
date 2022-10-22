package monate_01_Package;

import java.util.Scanner;
public class mitteBuchstabe {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir isim giriniz");

        String metin = scan.nextLine();
        int uzunluk=metin.length();
        int tekOrta=(uzunluk-1)/2;
        int ciftOrta=uzunluk/2;
        if (uzunluk%2 == 0) {

        System.out.println(metin.substring(ciftOrta-1,ciftOrta+1));}
        else {System.out.println(metin.substring(tekOrta,tekOrta+1));}
        scan.close();
    }
}
