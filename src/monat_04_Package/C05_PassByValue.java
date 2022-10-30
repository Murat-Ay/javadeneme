package monat_04_Package;

public class C05_PassByValue {
        public static void main(String[] args) {
            int sayi=11;
            sayi= method1(sayi); // 10*10=100 atarsak kalici olur
            System.out.println(sayi); // 100
        }
        public static int  method1(int sayi){
            sayi=sayi*sayi;
            return sayi;
        }
    }

