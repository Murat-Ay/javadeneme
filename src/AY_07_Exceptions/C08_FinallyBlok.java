package AY_07_Exceptions;

public class C08_FinallyBlok {
    public static void main(String[] args) {
        int a= 10;
        int b= 0;
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("bolecek sayi sifir olamaz");
        } finally {
            System.out.println("Finally blok calisti");
        }
    }
}
