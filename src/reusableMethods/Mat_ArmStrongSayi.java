package reusableMethods;

public class Mat_ArmStrongSayi {
    public static void main(String[] args) {
        //Tüm basamaklarındaki rakamların sayı değerlerinin küpleri toplamı,
        //kendisine eşit olan sayılara "Armstrong sayı"denir.
        //Örneğin; 371=3*3*+7*7*7+1*1*1=27+343+1=371
        int sum = 0;
        int digit;
        int temp;
        int number = 371;
        temp = number;
        while (temp > 0) {
            digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }
        if (number == sum){
            System.out.println(number + " is an armstrong number");
        }else System.out.println("it is not an armstrong number");
    }
}