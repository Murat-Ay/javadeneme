package monat_03_Package;

public class methodFaktoriyel {
    public static void main(String[] args) {
        int a=6;
        System.out.println("sonuc:" + faktoriyel(a));

        } public static int faktoriyel(int a){
        int faktoriyel=1;
        for (int i = a; i >=1 ; i--) {
            faktoriyel*=i; }
        return (faktoriyel);
        }
    }

