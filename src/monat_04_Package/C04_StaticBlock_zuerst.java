package Monat_04_Package;

public class C04_StaticBlock_zuerst {
    static int sayi;
        C04_StaticBlock_zuerst(){
            System.out.println("Constructor calisti");
        }
        public static void main(String[] args) {
            C04_StaticBlock_zuerst obj1=new C04_StaticBlock_zuerst();
            System.out.println("sayi : " + sayi);
        }
        static {
            System.out.println("ustteki static ilk block calisti");
        }
        static {
            System.out.println("static block calisti");
            sayi=40;
        }
    }


