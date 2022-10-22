package monate_01_Package;

import java.util.Scanner;

public class ifElse_blutSpende {
    public static void main(String[] args) {

        /*Kullanicidan  yasini ve kilosunu aliniz
        18 yasindan kucuk ise kan bagisi yapamaz
        18 yasindan buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz ?");
        int yas;
        yas = scan.nextInt();
        System.out.println("Lutfen kilonuzu giriniz ?");
        double kilo;
        kilo = scan.nextDouble();

        if (yas>18 && kilo>=50 ) System.out.println("Kan bagisi yapabilir");
        else if (yas>18 && kilo<50) System.out.println("Kan bagisi yapamaz");
        else if (yas<18) System.out.println("18 yasindan kucuk kisiler kan bagisi yapamaz");
        else System.out.println("Lutfen yasiniz tekrar giriniz ");
        }}
