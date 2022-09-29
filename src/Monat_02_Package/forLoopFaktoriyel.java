package Monat_02_Package;

import java.util.Scanner;

public class forLoopFaktoriyel {
    public static void main(String[] args) {
        //kullanicidan bir sayi girmesini isteyelim.
        //sonra bu sayidan 1 e kadar olan sayilarin carpimini ve yazmasini versin

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int a= scan.nextInt();
        int faktoriyel=1;
        for (int i = a; i >=1 ; i--) {
            faktoriyel*=i;
            if (i>1) {
                System.out.print(i+" * ");
            } else System.out.println(i);
        }
        System.out.println();
        System.out.println(a+"! = " +faktoriyel);
        scan.close();
    }
}

