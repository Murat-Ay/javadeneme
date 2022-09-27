package AY_02_Package;

import java.util.Scanner;

public class whileLoop500 {
    public static void main(String[] args) {
        //2 sayi isteyin toplam 500 veya gecerse yazdirin.
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        while (toplam<=500){
            System.out.println("lutfen toplamak uzere iki sayi giriniz");
            sayi = scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("girilrn sayilar toplami: " + toplam);
    }
}
