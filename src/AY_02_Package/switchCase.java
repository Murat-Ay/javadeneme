package AY_02_Package;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        // switch case den kullanici gün adini girince
        // "calisma günü veya tatil veya gecersiz gün girdiniz" yazdiralim.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun giriniz");
        String girilenGun= scan.nextLine();
        String gun = girilenGun.toLowerCase();
        switch (gun){
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("calisma gunu");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("tatil gunu");
                break;
            default:
                System.out.println("gecersiz gun ismi");

        }

    }
}
