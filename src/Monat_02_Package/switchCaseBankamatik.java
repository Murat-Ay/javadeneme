package Monat_02_Package;
import java.util.Scanner;
public class switchCaseBankamatik {
    public static void main(String[] args) {
        System.out.println("*******************************");
        System.out.println("\tATM'ye Hosgeldiniz.");
        String menu = "1.Islem : Bakiye Sorgulama" +
                "\n2.Islem : Para Yatirma" +
                "\n3.Islem : Para Cekme" +
                "\n4.Islem : Cikis";
        System.out.println(menu);
        System.out.println("*******************************");
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen yapmak istediginiz islemi seciniz : ");
        int bakiye = 1000;
        int islem = scan.nextInt();
        switch (islem){
            case 1 :
                System.out.println("Bakiyeniz : "+ bakiye + " €");
                break;
            case 2 :
                System.out.print("Yatirmak istediginiz tutari giriniz : ");
                int tutar = scan.nextInt();
                bakiye+=tutar;
                System.out.print("Yatirilan tutar : "+ tutar +" €\nYeni bakiyeniz : "+ bakiye + " €");
                break;
            case 3 :
                System.out.print("Cekmek istediginiz tutari girin : ");
                int cekilen = scan.nextInt();
                if(cekilen<=bakiye){
                    bakiye-=cekilen;
                    System.out.print("Kalan bakiyeniz : "+ bakiye);
                }else System.out.println("Yetersiz Bakiye!!!");
                break;
            case 4 :
                System.out.println("Cikis yapiliyor...");
                break;
            default:
                System.out.println("Gecersiz Islem!!!");
                break;
        }
}}
