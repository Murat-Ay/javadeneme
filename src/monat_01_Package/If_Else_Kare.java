package monat_01_Package;

import java.util.Scanner;

public class If_Else_Kare {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("lutfen bir sayi giriniz");
            boolean t=false;
            int sayi = input.nextInt(); // "x"in girilmesi
            for (int i = 0; i <= sayi ; i++) { // (X/2+1) kere dönen döngünün oluşturulması
                // Koşulun kontrol edilmesi
                if (sayi == i * i)
                {
                    t = true;
                    break; // Fazladan işlem yaptırmamak için karekökü bulunduğunda döngüden çıkarız
                }
            }
        // Koşulun sağlanıp sağlanmadığını kontrol etmek için "t"yi kullandık, çünkü koşul sağlandığında "t" değişecek.
            if (t)
                System.out.println("tam kare");
            else
                System.out.println("tam kare degil");
            input.close();
        }
    }

