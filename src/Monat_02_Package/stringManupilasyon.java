package Monat_02_Package;

public class stringManupilasyon {
    public static void main(String[] args) {

    String str= "isvicRe";
        System.out.println( str.toLowerCase() );
        System.out.println( str.toUpperCase());
        System.out.println( str.substring( str.length() - 1 ).toUpperCase() );

        String str1=str.toLowerCase();
        System.out.println( str1);
        String str2;
        str2=str1.substring( 0,str1.length()-1 )+str1.substring(str1.length()-1).toUpperCase();
        System.out.println(str2);

    }}
