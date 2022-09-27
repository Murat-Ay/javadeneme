package AY_02_Package;

public class continueKomutu {
    public static void main(String[] args) {
        /*
       break continue deyimleri arasında continue deyimi yine
       break deyiminde olduğu gibi for, while ve do-while
       döngülerinde kullanılmaktadır. break deyiminden
       farklı olarak continue döngüyü sonlandırmamakta
       fakat döngüde ilgili tekrarı atlamaktadır (es geçmektedir).
       Örneğin bir veritabanından yine tüm kayıtları çektiniz ve
       bu kayıtlar arasından 5. kayıdı atlamak istiyor ve
       döngünün devam etmesini istiyorsunuz. Bu gibi durumlarda
       continue kullanılabilecek en güzel tercihtir.
       Şimdi bu örneği kod üzerinde gösterelim;
         */

        int veritabaniKayitSayisi = 15;
        for(int i =1; i<=veritabaniKayitSayisi; i++) {
            if(i == 5) {
                continue;
            }
            System.out.println(i + ". kayit");
        }

        /* Yukarıdaki örnekte for döngüsü içerisinde if bloğunu tanımlayarak
        i değeri 5 olduğunda continue ile döngünün bir sonraki değer
        için başa dönmesini sağladık. Bu şekilde konsol ekranına
        5. kayıt şeklinde yazılmasının önüne geçmiş olduk.
        İlgili örneğin konsol çıktısı şu şekildedir; */

    }
}
