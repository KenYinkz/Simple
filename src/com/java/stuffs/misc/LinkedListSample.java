/***********************************************************************************************************************
 * FileName - LinkedListSample.java
 * <p>
 * (c) Disney. All rights reserved.
 * <p>
 * $Author: okunk001 $
 * $Revision: #1 $
 * $Change:  $
 * $Date: 9/26/2016 $
 **********************************************************************************************************************/
package com.java.stuffs.misc;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * LinkedListSample.
 */
public class LinkedListSample {

    static LinkedList<List<Integer>> linkedList = new LinkedList<>();

    static void insertIntoList (int index, List<Integer> list) {
        if (linkedList.size() >= index) {
            linkedList.add(index, list);
        }
    }

    static int resoluteIntoList (List<Integer> list) {
        linkedList.add(list);
        return linkedList.indexOf(list);
    }

    static void deleteFromList (int index, List<Integer> list) {
        if (linkedList.size() >= index) {
            linkedList.remove(index);
        }
    }


    public static void main (String[] argx) {
        insertIntoList(0, Arrays.asList(1,2,3));
        System.out.printf(" Index is %d %n", resoluteIntoList(Arrays.asList(1,2,3)));
    }
}
