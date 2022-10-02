package Monat_01_Package;

import java.util.Scanner;

public class ifElse3und5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Bir sayi giriniz");
    int sayi= scan.nextInt();

if (sayi%5==0 && sayi%3==0) System.out.println("sayi hem 3'e hem 5'e bolunebilir");
    if (sayi%3==0) System.out.println("Uc ile bolunebilen sayi");
    if (sayi%5==0) System.out.println("Bes ile bolunebilen sayi");
    else System.out.println("uc ve bes ile bolunebilen sayi degil");
}}
