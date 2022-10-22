package monate_01_Package;

import java.util.Scanner;

public class gleichseitigesDreieck {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ucgenin 1.kenarini tamsayi olarak giriniz");
        System.out.println("ucgenin 2.kenarini tamsayi olarak giriniz");
        System.out.println("ucgenin 3.kenarini tamsayi olarak giriniz");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();
        if (kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("girilen ucgen eskenar ucgendir");}
            else System.out.println("eskenar ucgen degildir");
        }
    }