package com.java.stuffs.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * MergeSort
 */
public class MergeSort {

    static List<Integer> divideArray(List<Integer> givenList) {
        if (givenList.size() == 1) {
            return givenList;
        }
        int size = Math.abs(givenList.size() / 2);
        List<Integer> firstPart = new ArrayList<>(size);
        List<Integer> secondPart = new ArrayList<>(givenList.size() - size);
        for (int a = 0; a < size; a++) {
            firstPart.add(givenList.get(a));
        }
        for (int a = size; a < givenList.size(); a++) {
            secondPart.add(givenList.get(a));
        }

        firstPart = divideArray(firstPart);
        secondPart = divideArray(secondPart);

        return mergeSort(firstPart, secondPart);
    }

    static List<Integer> mergeSort(List<Integer> a, List<Integer> b) {
        List<Integer> c = new ArrayList<>();

        while (a.size() > 0 && b.size() > 0) {
            if (a.get(0) > b.get(0)) {
                c.add(b.get(0));
                b.remove(0);
            } else {
                c.add(a.get(0));
                a.remove(0);
            }
        }

        while (b.size() > 0) {
            c.add(b.get(0));
            b.remove(0);
        }

        while (a.size() > 0) {
            c.add(a.get(0));
            a.remove(0);
        }

        return c;
    }

    public static void main(String[] args) {
        List<Integer> someArray = Arrays.asList(74, 33, 27, 35, 10, 15, 30, 50, 82, 19, 12);
        long time = System.currentTimeMillis();

        System.out.printf("%n Before sort = %s", someArray);

        someArray = divideArray(someArray);

        System.out.printf("%n After sort = %s; %n%n Sorted in %d secs %n%n",
                someArray,
                System.currentTimeMillis() - time
        );
    }
}
