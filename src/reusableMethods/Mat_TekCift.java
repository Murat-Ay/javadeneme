package reusableMethods;

import java.util.Scanner;

public class Mat_TekCift {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi yazınız lütfen");
        int number= scan.nextInt();
        System.out.println(isOdd(number));
    }
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
    /*public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println("Bir sayi yazınız lütfen");
     int number= scan.nextInt();
     number=40;
if (number % 2==1)
System.out.println("Sayı tek");
        else
System.out.println("Sayı çift"); }  */