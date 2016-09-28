package com.java.stuffs.sorting;

import java.util.Arrays;
import java.util.List;

/**
 * SelectionSort O (n sq.)
 */
public class SelectionSort {

    public static void main(String[] args) {
        List<Integer> someArray = Arrays.asList(74, 33, 27, 35, 10, 15, 30, 50, 82, 19);
        long time = System.currentTimeMillis();

        System.out.printf("%n Before sort = %s", someArray);

        for (int a = 0; a < someArray.size() - 1; a++) {
            int lowestValue = someArray.get(a);
            int lowestValuePosition = a;
            for (int b = a + 1; b < someArray.size(); b++) {
                if (lowestValue > someArray.get(b)) {
                    lowestValue = someArray.get(b);
                    lowestValuePosition = b;
                }
            }
            if (a != lowestValuePosition) {
                someArray.set(lowestValuePosition, someArray.get(a));
                someArray.set(a, lowestValue);
            }
        }

        System.out.printf("%n After sort = %s; %n%n Sorted in %d secs %n%n",
                someArray,
                System.currentTimeMillis() - time
        );
    }
}
