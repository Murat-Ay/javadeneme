package monat_01_Package;

import java.util.Scanner;

public class if_karekok {
    public static void main(String[] args) {
        /*Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını bulunuz,
        tamkare ise true değilse false yazdırınız. Ornek : input : 16, output:4 */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen pozitif bir sayi giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a==b*b){
        System.out.println("true");}
        else {System.out.println("false");
        }}}


