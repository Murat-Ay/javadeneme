package java_interview;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class iteratorArray {
    /*  (iterator ile index kullanimina ornek) Bir listedeki ilk n elemani iterator kullanarak 5 artirin.
     Orn : list : [2,13,56,23,45,14,40]    artirilmasi istenen eleman sayisi : ilk 3
           output: [7,18,61,23,45,14,40]     */
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(56);
        sayilar.add(23);
        sayilar.add(45);
        sayilar.add(14);
        sayilar.add(40);
        // Sadece ilk 3 elementi iterator ile 5 artiralim
        ListIterator lit= sayilar.listIterator();
        for (int i = 0; i < 3; i++) {
            lit.set((Integer)lit.next()+5);
        }
        System.out.println(sayilar); // [7, 18, 61, 23, 45, 14, 40]
    }
}

