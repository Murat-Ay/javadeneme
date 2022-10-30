package monat_04_Package;

public class StringBuilderMethod {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("ali can");
        sb1.append( "8877" );
        StringBuilder sb2=new StringBuilder("ali veli can");
        StringBuilder sb3=new StringBuilder(7);
        System.out.println( sb1 );
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        System.out.println(sb1.delete( 2,4 ));
        System.out.println(sb1.insert( 3,6 ));
        System.out.println(sb1.insert( 4,"Banka" ));
        System.out.println(sb1.replace( 4,7,"Nese" ));
        StringBuilder sb4=new StringBuilder("isvicre");
        System.out.println(sb4.substring( 3,6 ));
        System.out.println(sb4.reverse()); //ercivsi-ters cevirir
        sb4.append( "99" );//ercivsi99-ekleme yapar
        System.out.println( "sb4 = " + sb4 );
        System.out.println(sb4.toString().contains( "civ" ));
    }}
