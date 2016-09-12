package com.java.stuffs.sorting;

import java.util.Arrays;
import java.util.List;

import static java.lang.Math.abs;

/**
 * ShellSort.
 */
public class ShellSort {

    public static void main (String[] args) {
        List<Integer> someArray = Arrays.asList(74, 33, 27, 35, 10, 15, 30, 50, 82, 19, 93, 32, 133, 76, 24, 45, 53, 64, 552,563,205, 90);
        long time = System.nanoTime();

        int interval = abs(someArray.size() / 3);

        while (interval > 0) {
            for (int a = interval; a < someArray.size(); a++) {
                int value = someArray.get(a);
                int inner = a;
                while (inner > interval - 1 && someArray.get(inner - interval) >= value) {
                    someArray.set(inner, someArray.get(inner - interval));
                    inner = inner - interval;
                }
                someArray.set(inner, value);
            }
            interval = abs(interval / 2);
        }

        System.out.printf("%n After sort = %s; %n%n Sorted in %d secs %n%n",
                someArray,
                System.nanoTime() - time
        );
    }

}
