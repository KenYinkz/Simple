package com.java.stuffs.searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by adeyinkaokuneye on 13/09/2016.
 */
public class HashTableSearch {

    static int hashCode (int value) {
        return value % 20;
    }

    public static void main (String[] args) {

        List<Integer> someArray = Arrays.asList(74, 33, 27, 35, 10, 15, 30, 50, 82, 19, 93, 32, 133, 76, 24, 45, 53, 64, 552,563,205, 90);
        Map<Integer, Integer> hashTable = new HashMap<>();

        for (int a : someArray) {
            int k = hashCode(a);
            if (hashTable.get(k) == null) {
                hashTable.put(k, a);
            } else {
                hashTable.put(linearProbing(hashTable, k), a);
            }
        }

        int search = 15;
        int searchKey = hashCode(search);
        while (hashTable.get(searchKey) != null) {
            if (hashTable.get(searchKey) == search) {
                System.out.printf(" 'search' found at index %d %n", searchKey);
                break;
            }

            ++searchKey;

            searchKey %= hashTable.size();
        }
    }

    private static int linearProbing(Map<Integer, Integer> hashTable, int k) {
        while (hashTable.get(k) != null) {
            k = k + 1;
        }
        return k;
    }
}
