package AY_01_Package;
import java.util.*;
public class ay_tamkare1 {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        long i, x, t = 0; // Değişkenlerin tanımlanması
        x = input.nextInt(); // “x”in girilmesi
        for (i = 0; i <= x ; i++) { // (X/2+1) kere dönen döngünün oluşturulması
            // Koşulun kontrol edilmesi
            if (x == i * i)
            {
                t = 1;
                break; // Fazladan işlem yaptırmamak için karekökü bulunduğunda döngüden çıkarız
            }
        }
        // Koşulun sağlanıp sağlanmadığını kontrol etmek için “t”yi kullandık,
        // çünkü koşul sağlandığında “t” değişecek
        // Sonucun yazdırılması
        if (t != 0)
            System.out.println("tam kare");
        else
            System.out.println("tam kare degil");
        input.close();
    }
}

