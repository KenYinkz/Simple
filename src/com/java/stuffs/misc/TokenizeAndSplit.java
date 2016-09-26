package com.java.stuffs.misc;

import java.util.StringTokenizer;

/**
 * TokenizeAndSplit.
 */
public class TokenizeAndSplit {

    public static void main(String[] args) {
        String delims = ",";
        String splitString = "one,two,,three,four,,five";

        System.out.printf("%nStringTokenizer Example:%n");
        StringTokenizer st = new StringTokenizer(splitString, delims);
        while (st.hasMoreElements()) {
            System.out.println("StringTokenizer Output: " + st.nextElement());
        }

        System.out.printf("%n%nSplit Example:%n");
        String[] tokens = splitString.split(delims);

        for (String token : tokens) {
            System.out.println("Split Output: " + token);
        }
    }
}
