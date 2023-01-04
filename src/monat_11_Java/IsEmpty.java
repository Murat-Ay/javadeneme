package monat_11_Java;

public class IsEmpty {
    public static void main(String[] args) {

    /* isEmpty(); Bir stringin içeriğindeki karakter adedi sıfır ise yani hiç elemanı yoksa,
    başka bir deyişle hiçbir şeyden oluşuyorsa true(doğru) ,
    içeriğinde 1 veya daha fazla karakter barındırıyorsa false(yanlış) sonucunu veren string sınıfı metodudur.   */

    String doluMetin = "Metin";
    String bosMetin = "";
    String boslukluMetin = "  ";


System.out.println(doluMetin.isEmpty()); //false
System.out.println(bosMetin.isEmpty()); //true
System.out.println(boslukluMetin.isEmpty()); //false
}}
