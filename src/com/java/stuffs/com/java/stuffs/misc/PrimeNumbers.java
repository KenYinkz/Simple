package com.java.stuffs.com.java.stuffs.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * PrimeNumbers.
 */
public class PrimeNumbers {

    // get all prime numbers up to x

    public static void main (String[] args) {
        int top  = 1000;

        List<Integer> someArray = new ArrayList<>(top);
        for (int a = 0; a < top; a++) {
            someArray.add(a);
        }

        List<Integer> primes = someArray.stream()
                .filter(i -> {
                    if (i < 2 ) {
                        return false;
                    }
                    for (int a = 2; a < 10; a++) {
                        if (i % a == 0 && i != a) {
                            return false;
                        }
                    }
                    return true;
                })
                .collect(Collectors.toList());

        System.out.printf("%nPrimes between 1 to 'top' %d ==>%n %s%n%n", top, primes);
    }

}
