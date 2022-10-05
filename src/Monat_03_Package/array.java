package Monat_03_Package;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
    int[] arr={1,8,3,9,15};
        System.out.println(arr);//[I@58372a00
        System.out.println(arr.length);//5

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();//1 8 3 9 15
        System.out.println(Arrays.toString(arr));//[1, 8, 3, 9, 15]

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 3, 8, 9, 15]

        System.out.println(Arrays.binarySearch(arr,8));//sort sonrasi siralamayi verir
        System.out.println(Arrays.binarySearch(arr,9));
        System.out.println(Arrays.binarySearch(arr,7));//olmayan deger negatif olur

    }}
