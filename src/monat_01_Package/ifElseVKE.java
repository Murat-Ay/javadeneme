package monat_01_Package;

import java.util.Scanner;

public class ifElseVKE {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Lutfen Kg olarak kilonuzu giriniz");
        double kilo= scan.nextDouble();
        System.out.println("Lutfen Cm olarak boyunuzu giriniz");
        double boy= scan.nextDouble();
        double vke=kilo*10000/(boy*boy);
        System.out.println("Vucut kitle endeksiniz : " + vke);
        if (vke>=30) System.out.println("Obez");
        else if(vke>=28) System.out.println("Kilolu");
        else if(vke>=26) System.out.println("Az kilolu");
        else if(vke>=25) System.out.println("Normal");
        else System.out.println("Zayif");
        }
    }


