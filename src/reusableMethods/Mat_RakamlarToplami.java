package reusableMethods;

public class Mat_RakamlarToplami {
    public static void main(String[] args) {
        int number = 1234;
        int toplam = 0;
        while(number > 0) {
            toplam += number%10;
            number = number/10;
        }
        System.out.println("Rakamlar Toplami = "+toplam);
    }
}