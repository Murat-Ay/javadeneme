package AY_05_Overriding;

public class BKuslar extends AHayvanlar {
    String tur="Kus";
    String isim="Kus Isim belirtilmedi";
    String ayak="Kuslarin ayagi vardir";
    void kanat(){
        System.out.println("Kuslar kanatlidir");
    }

    void solunum(){
        System.out.println("Kuslar akcigerle nefes alirlar");
    }

    void gaga(){
        System.out.println("Kuslarin gagalari vardir");
    }

    void cogalma(){
        System.out.println("Kuslar yumurtayla cogalir");
    }
}
