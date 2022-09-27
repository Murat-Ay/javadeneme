package AY_02_Package;
import java.util.Scanner;
public class WhileBolme {
    //Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
    //kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
    static int bolum;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bolunen sayiyi giriniz : ");
        int bolunen = scan.nextInt();
        System.out.print("Lutfen boleceginiz sayi giriniz : ");
        int bolen = scan.nextInt();
        System.out.println("Sonuc : " + bolmeIslemi(bolunen,bolen));
    }
    public static int bolmeIslemi (int a, int b){

        while (a>=b){
            a-=b;
            bolum++;
        }
        return bolum;
    }
}
