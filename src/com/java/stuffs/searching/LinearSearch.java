package com.java.stuffs.searching;

import java.util.Arrays;
import java.util.List;

/**
 * Created by adeyinkaokuneye on 13/09/2016.
 */
public class LinearSearch {

    public static void main (String[] argz) {
        List<Integer> someArray = Arrays.asList(74, 33, 27, 35, 10, 15, 30, 50, 82, 19, 93, 32, 133, 76, 24, 45, 53, 64, 552,563,205, 90);
        int a = 1033;
        int index = -1;
        for (int x = 0; x < someArray.size(); x++) {
            if (someArray.get(x) == a) {
                index = x;
                break;
            }
        }

        if (index < 0) {
            System.out.printf(" Not found");
        } else {
            System.out.printf(" 'a' found at index %d", index);
        }

    }
}
