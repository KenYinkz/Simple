package com.java.stuffs.sorting;

import java.util.Arrays;
import java.util.List;

/**
 * QuickSort. O (n log n)
 */
public class QuickSort {

    static List<Integer> quickSort(List<Integer> arr, int lower, int upper){

        if (lower < upper) {

            int i = lower;
            int j = upper;
            int pivot = arr.get(upper);

            while (i < j) {
                while (arr.get(i) < pivot) {
                    i++;
                }
                while (arr.get(j) > pivot) {
                    j--;
                }
                if (i <= j) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                    i++;
                    j--;
                }
            }
            if (lower < j) {
                quickSort(arr, lower, j);
            }
            if (i < upper) {
                quickSort(arr, i, upper);
            }
        }

        return arr;
    }


    public static void main (String[] args) {

        List<Integer> someArray = Arrays.asList(74, 33, 27, 35, 10, 15, 30, 50, 82, 19, 93, 32, 133, 76, 24, 45, 53, 64, 552,563,205, 90);

        long time = System.nanoTime();
        someArray = quickSort(someArray, 0, someArray.size() - 1);

        System.out.printf("%n After sort = %s; %n%n Sorted in %d secs %n%n",
                someArray,
                System.nanoTime() - time
        );
    }

}
