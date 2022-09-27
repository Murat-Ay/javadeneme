package AY_02_Package;

public class ReverseNumber {
    public static void main(String[] args) {
        int input=12348;
        System.out.println("Sayinin ters cevrilmis hali:"
                + reverseNumber(input));}
        public static int reverseNumber(int number) {
            int output=0;
            while (number>0){
                output=output*10 + number%10;
                number=number/10;
            }
    return output;
   }
}
