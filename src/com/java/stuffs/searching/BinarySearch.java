package com.java.stuffs.searching;

/**
 * Created by adeyinkaokuneye on 13/09/2016.
 */
public class BinarySearch {


    public static void main (String[] argx) {
        int[] a = new int [] {10, 15, 19, 24, 27, 30, 32, 33, 35, 45, 50, 53, 64, 74, 76, 82, 90, 93, 133, 205, 552, 563};
        int index = -1;
        int searched = 10;
        int lower = 0;
        int higher = a.length - 1;
        int mid = Math.abs((higher + lower)/ 2);

        while (index < 0) {

            if (higher < lower) {
                System.out.printf("Not Found");
                break;
            }

            if (searched > a[mid]) {
                lower = mid + 1;
                mid = Math.abs((higher + lower)/ 2);
            } else if (searched < a[mid]) {
                higher = mid;
                mid = Math.abs((higher + lower)/ 2);
            } else if (a[mid] == searched) {
                index = mid;
            }
        }

        System.out.printf(" 'searched' was found at index %d %n", index);
    }

}
