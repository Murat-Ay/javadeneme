package monat_01_Package;
import java.util.Scanner;

public class werkTags {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");

        String gunIsmi= scan.next();
        String gunIsmiKontrolIcin= gunIsmi.toLowerCase();

        String[] gunler = {"pazartesi","sali","carsamba","persembe","cuma","cumartesi","pazar"};
        for (int i=0; i<gunler.length; i++) {
            if (gunIsmi.equals(gunler[i]) && i < 5) {
                System.out.println("calışma zamanı");
            }
        }}}
