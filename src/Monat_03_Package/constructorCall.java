package Monat_03_Package;

public class constructorCall {

        constructorCall(){
            System.out.println("parametresiz cons. calisti");
        }
        constructorCall(int sayi){
            this();
            System.out.println("parametreli cons. calisti");
        }
        public static void main(String[] args) {
            constructorCall obj=new constructorCall(20);
        }
    }

