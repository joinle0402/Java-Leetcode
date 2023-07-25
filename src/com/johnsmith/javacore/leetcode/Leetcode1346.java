package com.johnsmith.javacore.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1346 {
    public static void main(String[] args) {
        System.out.println(Leetcode1346.checkIfExist(new int[]{-2,0,10,-19,4,6,-8}));
    }

    public static boolean checkIfExist(int[] array) {
        Map<Integer, Boolean> existMap = new HashMap<>();
        for (int number : array) {
            if (existMap.containsKey(number * 2) || (number % 2 == 0 && existMap.containsKey(number / 2))) {
                return true;
            } else {
                existMap.put(number, true);
            }
        }
        return false;
    }
}
