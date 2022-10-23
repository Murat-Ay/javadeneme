package monat_02_Package;

import java.util.Scanner;

public class ifElseMail {
    public static void main(String[] args) {
        // kullanicidan bir mail alin - mail @ icermiyorsa "gecersiz mail"
        // - mail @gmail.com icermiyorsa, "mail gmail olmali"
        // - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("mail adresinizi giriniz");
        String mail= scan.nextLine();
        if (!mail.contains("@")){
            System.out.println("gecersiz mail");} else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");}
        else if (!mail.endsWith("@gmail.com")){
        System.out.println("mailde yazim hatasi");

        }else {
            System.out.println("mail basari ile girildi");
        }

    }
}
