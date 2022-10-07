package Monat_02_Package;
import java.util.Scanner;
public class ifGrossZahl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int enBuyukSayi = 0;
        int count = 0;
        while (count<5){
            System.out.println("Lutfen bir tamsayi giriniz : ");
            int sayi = scan.nextInt();
            if(sayi>enBuyukSayi){
                enBuyukSayi = sayi;
            }
            count++;
        }
        System.out.println("Girdiginiz sayilarin en buyugu = " + enBuyukSayi );
    }
}
