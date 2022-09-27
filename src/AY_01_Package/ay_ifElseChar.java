package AY_01_Package;

import java.util.Scanner;

public class ay_ifElseChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenChar=scan.next().charAt(0);
        if (girilenChar>='A' && girilenChar<='Z'){
            System.out.println("Girilen karakter buyuk harf");
        }
        else System.out.println("Girilen karakter buyuk harf degil");
    }
}

