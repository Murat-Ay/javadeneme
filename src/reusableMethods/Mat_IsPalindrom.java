package reusableMethods;

public class Mat_IsPalindrom {
    public static void main(String[] args) {
        int num=151;
        System.out.println(isPalindrome(num));
    }
    /* Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
    Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889, 13531 vb.
    Asal palindromik sayılar: 2, 3, 5, 7, 11, 101, 131, 151, 181   */
    public static boolean isPalindrome(int num) {
        // Finding the reverse of the number
        int reverseNum = 0;
        int n = num;
        while (n != 0) {
            reverseNum = (reverseNum * 10) + (n % 10);
            n /= 10;
        }
        if (reverseNum == num)   {  // Checking if the number and its  // reverse is equal
            return true;
        } else
            return false;
    }
}