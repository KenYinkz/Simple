/***********************************************************************************************************************
 * FileName - InsertionSort.java
 * <p>
 * (c) Disney. All rights reserved.
 * <p>
 * $Author: okunk001 $
 * $Revision: #1 $
 * $Change:  $
 * $Date: 8/30/2016 $
 **********************************************************************************************************************/
package com.gtest.sorting;

import java.util.Arrays;
import java.util.List;

/**
 * InsertionSort.
 */
public class InsertionSort {

    public static void main(String[] args) {
        List<Integer> someArray = Arrays.asList(74, 33, 27, 35, 10, 15, 30, 50, 82, 19);
        long time = System.currentTimeMillis();

        System.out.printf("%n Before sort = %s", someArray);

        int value;
        int position;

        for (int a = 0; a < someArray.size(); a++) {
            value = someArray.get(a);
            position = a;
            // check if we are second element and check backwards to see if we can insert anywhere
            while (position > 0 && someArray.get(position - 1) > value) {
                someArray.set(position, someArray.get(position - 1));
                position = position - 1;
            }
            someArray.set(position, value);
        }

        System.out.printf("%n After sort = %s; %n%n Sorted in %d secs %n%n",
                someArray,
                System.currentTimeMillis() - time
        );
    }

}
