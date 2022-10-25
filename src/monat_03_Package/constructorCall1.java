package monat_03_Package;

public class constructorCall1 {
        static String isim= "John Doe";
        static int yas = 40;
        public constructorCall1(){
            isim="Seher";
        }
        public constructorCall1(String isim, int yas){
            this();
            this.yas=yas;
        }
        public static void main(String[] args) {
            constructorCall1 obj1=new constructorCall1();
            constructorCall1 obj2=new constructorCall1("Fatih",35);
            System.out.println("isim : " +obj1.isim +
                    " yas : "+ obj2.yas);
        }
    }

