package monat_01_Package;
public class StringsMethods {
    public static void main(String[] args) {
        String A= "Hello";
        String B= "World";
        System.out.println("Hello"+ B);//HelloWorld
        System.out.println(A);//Hello
        System.out.println(A.length());//5
        System.out.println(A.charAt( 4 ) );//o
        System.out.println(A.indexOf( "e" ));//1
        System.out.println(A.startsWith("H"));//true
        System.out.println(A.endsWith("o"));//true
        System.out.println(A.repeat( 3 ));//HelloHelloHello
        System.out.println(A.replace( "llo","y" ));//Hey
        System.out.println(A.concat( B ));//HelloWorld
        System.out.println(A.substring( 2,4 ));//ll
        System.out.println(A.contains("Z"));//false
        System.out.println(A.equals("B"));//false
        System.out.println(A.replace( "Hello","Java" ));//Java
        System.out.println(A.toUpperCase() );//HELLO
        System.out.println(B.toLowerCase() );//world

    }
}
