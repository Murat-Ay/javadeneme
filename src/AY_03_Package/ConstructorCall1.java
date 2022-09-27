package AY_03_Package;

public class ConstructorCall1 {
        static String isim= "John Doe";
        static int yas = 40;
        public ConstructorCall1(){
            isim="Seher";
        }
        public ConstructorCall1(String isim, int yas){
            this();
            this.yas=yas;
        }
        public static void main(String[] args) {
            ConstructorCall1 obj1=new ConstructorCall1();
            ConstructorCall1 obj2=new ConstructorCall1("Fatih",35);
            System.out.println("isim : " +obj1.isim +
                    " yas : "+ obj2.yas);
        }
    }

