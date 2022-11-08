package monat_02_Package;
public class forLoop {
    public static void main(String[] args) {
        // 1'den 50'e kadar(50 dahil) olan sayilari yan yana
        // aralarinda bir bosluk birakarak yazdiralim
        for (int i = 1; i <50 ; i++) {
            System.out.print(i +" "); }
        System.out.println("");
            // 1'den 50'e kadar(50 dahil) sayilardan
            // 3 ile bolunebilenleri yan yana aralarinda bir bosluk birakarak yazdiralim
            for (int j = 1; j <50 ; j++) {
                if (j%3==0) System.out.print(j + " "); }
        // 1'den baslayarak sayilari 3'er 3'er artirarak yazdiralim.//
        System.out.println("");
        for (int i = 1; i <=50; i+=5) {
            System.out.print(i + " ");
        }


        System.out.println();
        System.out.println("Merhaba,\nbana kalbin kadar temiz bu kod sayfasını ayirdigin için teşekkür ederim");
    }}