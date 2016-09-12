package com.java.stuffs.sorting;

import java.util.Arrays;
import java.util.List;

/**
 * BubbleSort.
 */
public class BubbleSort {
    public static void main(String[] args) {

        List<Integer> someArray = Arrays.asList(74, 33, 27, 35, 10, 15, 30, 50, 82, 19);
        long time = System.currentTimeMillis();

        System.out.printf("\n Before sort = %s", someArray);

        for (int i = 0; i < someArray.size(); i++) {
            boolean swapped = false;
            for (int a = 0; a < someArray.size() - 1; a++) {
                if (someArray.get(a) > someArray.get(a + 1)) {
                    int small = someArray.get(a + 1);
                    someArray.set(a + 1, someArray.get(a));
                    someArray.set(a, small);

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        System.out.printf("%n After sort = %s; %n%n Sorted in %d secs %n",
                someArray,
                System.currentTimeMillis() - time
        );
    }
}
