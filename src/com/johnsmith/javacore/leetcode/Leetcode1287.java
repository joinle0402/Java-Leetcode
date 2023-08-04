package com.johnsmith.javacore.leetcode;

import java.util.HashMap;

public class Leetcode1287 {
    public static void main(String[] args) {
        System.out.println(Leetcode1287.findSpecialInteger(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10}));
    }

    public static int findSpecialInteger(int[] array) {
        HashMap<Integer, Integer> counterMap = new HashMap<>();

        for (int element : array) {
            counterMap.put(element, counterMap.getOrDefault(element, 0) + 1);
        }

        int maxValue = Integer.MIN_VALUE;
        int result = 0;
        for(int i : counterMap.keySet()){
            if (maxValue < counterMap.get(i)) {
                maxValue = counterMap.get(i);
                result = i;
            }
        }

        return result;
    }
}
