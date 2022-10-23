package monat_02_Package;

public class regex {
    public static void main(String[] args) {
        //Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        // sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
        // input : java1 ogRe2@nMek3 #ne +Gu=zel output : java ogrenmek ne guzel
        String str="java1 ogRe2@nMek3 #ne +Gu=zel";
        str=str.replaceAll("\\d","");
        str=str.replaceAll("\\W","");

        str=str.toLowerCase();
        System.out.println(str);
    }
}
