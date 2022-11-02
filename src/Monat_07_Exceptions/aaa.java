package Monat_07_Exceptions;

import java.util.Scanner;

public class aaa {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen bolunecek sayi giriniz");
        int a= scan.nextInt();
        System.out.println("lutfen bolecek sayi giriniz");
        int b= scan.nextInt();
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("Bölecek sayi sifir olmaz");
        }

    }


}
