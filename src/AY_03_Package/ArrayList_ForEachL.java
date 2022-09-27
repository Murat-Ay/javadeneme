package AY_03_Package;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ForEachL {
        public static void main(String[] args) {
            //Verilen String bir listede istenmeyen harf iceren elementleri
            //silip, kalan kismini bize donduren bir method olusturun.

            List<String> liste=new ArrayList<>();
            liste.add("Fatih");
            liste.add("Bora");
            liste.add("Ahmet");
            liste.add("Nese");
            liste.add("Meryem");
            String istenmeyenHarf="A";
            String istenmeyenHarf1="a";
            List<String> yeniList=new ArrayList<>();
            for (String each:liste
            ) {
                if (!each.contains(istenmeyenHarf)&&!each.contains(istenmeyenHarf1)){
                    yeniList.add(each);
                }
            }
            System.out.println(yeniList);
        }}
