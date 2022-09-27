package AY_01_Package;

import java.util.Scanner;

public class Dikdortgen {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Dikdortgenin iki kenar uzunlugunu girin \nilk kenari girdikten sonra enter'a basin");
            double kenar1= scan.nextDouble();
            double kenar2= scan.nextDouble();
            System.out.println("Dikdortgenin alani : " + kenar1*kenar2);
        }
    }


