package Monat_09_interview;

public class inputReverseOutput {
    public static void main(String[] args) {
        int input=34567;
        System.out.println("Girilen sayinin ters cevirilmis hali : "+reverseNumber(input));
    }
    public static int reverseNumber(int number) {
        int output=0;

        while (number>0) {

            output = output*10 + number%10;
            number = number / 10;
        }
        return output;
    }
}

