package monat_02_Package;

public class nestedForLoop {
    public static void main(String[] args) {
        int sutun=8;
        int satir=10;
        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun ; j++) {
                System.out.print(i*j + " ");

            }
            System.out.println();
        }
    }
}
