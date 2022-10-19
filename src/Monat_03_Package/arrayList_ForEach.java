package Monat_03_Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class arrayList_ForEach {
        public static void main(String[] args) {
         //verilen bir array'in tum elementlerini olusturacaginiz bir list'e ekleyin

            int[] arr = {2,3,5,6,7,5,3,2,5,7,4,3,3,56,72,9};
            List<Integer> sayilar=new ArrayList<>();
            System.out.println(sayilar);
            for (int each: arr
            ) {
                sayilar.add(each);
            }
            System.out.println("Listenin son hali : " + sayilar);

            Collections.sort(sayilar);// array list sayilarin siralanmasi
            System.out.println(sayilar);

            Arrays.sort(arr); // arr siralanamsi
            System.out.println(Arrays.toString(arr));
        }
    }

