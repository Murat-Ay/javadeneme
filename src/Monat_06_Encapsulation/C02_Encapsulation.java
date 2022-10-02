package Monat_06_Encapsulation;

public class C02_Encapsulation {
    public static void main(String[] args) {
        C01_Encapsulation obj= new C01_Encapsulation();
        System.out.println(obj.getYas()); // 0
        obj.setYas(25);
        System.out.println("yas : "+ obj.getYas()); // 20
        /*biz bir objeye deger atamasini kontrol edemeyiz
         kullanici kac degerini atarsa
         Java o degeri kullanir
         Encapsulation'in faydalarindan biri de
         bu deger atamasini getter veya setter method'larinda kontrol edebilmektir.*/

        System.out.println( C01_Encapsulation.getHastaneAdi()); // Yildiz Hastanesi

        //C01.hastaneAdi="Gicik Hastane";

        System.out.println( C01_Encapsulation.getHastaneAdi()); // Yildiz Hastanesi
    }
}

