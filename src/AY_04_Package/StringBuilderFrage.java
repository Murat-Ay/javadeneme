package AY_04_Package;

public class StringBuilderFrage {
    public static void main(String[] args) {

    String numbers="012345678";
        System.out.println(numbers.substring(1,3));//12
        System.out.println(numbers.substring(4,7));//456
        System.out.println(numbers.substring(7));//78
        StringBuilder sb1= new StringBuilder();
        System.out.println( sb1.capacity() );//16
        sb1.append("veli can");
        System.out.println( sb1 );
        System.out.println( sb1.capacity() );//baslangicta bos 16 olusturur sonra veli can 8 ekledi
        System.out.println(sb1.length());//8
    }}
