package Monat_02_Package;

import java.util.Scanner;

public class replaceAllCard {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Adinizi Giriniz");
        String isim=scanner.nextLine();
        System.out.println("Lütfen Soyadinizi Giriniz");
        String soyIsim=scanner.nextLine();
        System.out.println("Lütfen Kredi Karti Numaranizi Giriniz");
        String kartNo= scanner.nextLine();
        System.out.println("Lütfen Kredi Kartinizin Son kullanim tarihini giriniz");
        String sonTar=scanner.nextLine();
        System.out.println("Lütfen Kredi Kartinizin CVC numarasini giriniz");
        String ccvNo=scanner.next();

        String yeniAdSoyad= new String(isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\w", "*") + " " +
                soyIsim.substring(0, 1).toUpperCase()+
                soyIsim.substring(1).replaceAll("\\w", "*"));

        String yeniKartNo= kartNo.substring(0, 5).replaceAll("\\w", "*") +" "+
                kartNo.substring(5, 9).replaceAll("\\w", "*")+" "+
                kartNo.substring(9, 13).replaceAll("\\w", "*") + " "+
                kartNo.substring(kartNo.length()-5,kartNo.length()-1);

        String yeniCCV= ccvNo.substring(0,2).replaceAll("\\d", "*") + ccvNo.substring(ccvNo.length()-1);

        System.out.println(yeniAdSoyad + "\n"+ yeniKartNo + "\nExpD: "+sonTar + ",   CCV: "+ yeniCCV);


    }
}
