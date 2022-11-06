package monat_11_interview;

import java.util.Scanner;

public class dreiecksBereich {
    public static void main(String[] args) {
        /*  Kullanicidan aldıgımız rastgele 3 tane pozitif  tam sayinin bir ucgen olup olmayacgini kontrol ediniz.
        eger ucgen olabiliyor ise ucgenin alanini hesaplayiniz.
        üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük,
        herhangi iki kenar farkı diger kenardan kücük olmali          */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen üç adet pozitif tamsayı giriniz");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if (a<=0 || b<=0 || c<=0 ) {
            System.out.println("Hatalı veri girişi yaptınız");
        } else {
            if (a + b > c && c > a - b) {
                System.out.println("girdiğiniz uzunluklardan bir üçgen oluşturulabilir");
            } else {
                System.out.println("girdiğiniz uzunluklardan bir üçgen oluşturulamaz");
            }
        }
        double alaninKaresi;
        double yariCevre;
        double alan;
        yariCevre=(a+b+c)/2;
        alaninKaresi= yariCevre*(yariCevre-a)*(yariCevre-b)*(yariCevre-c);
        alan=Math.sqrt(alaninKaresi);//karekök alma işlemi
        System.out.println(alan);
    }
}

