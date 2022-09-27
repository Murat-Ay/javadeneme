package AY_01_Package;

import java.util.Scanner;

public class ay_ifElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        double not=scan.nextDouble();
        if (not>=50) {
            System.out.println("sinifi gectin");
        }
        else System.out.println("maalesef kaldin");
        }
}

