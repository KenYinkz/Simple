package com.java.stuffs.searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by adeyinkaokuneye on 13/09/2016.
 */
public class InterpolationSearch {

    public static void main (String[] args) {

        List<Integer> someArray = new ArrayList<>(1000);
        for (int a = 0; a < 1000; a++) {
            someArray.add(a);
        }

        int high = someArray.size() - 1;
        int low = 0;
        int mid;
        int search = new Random().nextInt(someArray.size());
        int index = -1;

        if (search > someArray.get(high)) {
            System.out.printf("Not Found!");
            System.exit(1);
        }

        int d = 2 % 20;

        while (index < 0) {

            mid = low + ((high - low) / (someArray.get(high) - someArray.get(low))) * (search - someArray.get(low));

            if (someArray.get(mid) == search) {
                index = mid;
                System.out.printf(" 'search' %d found at index %d %n", search, mid);
            }

            if (someArray.get(mid) < search) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
    }
}
